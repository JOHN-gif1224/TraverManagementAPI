package com.bus_management_project_kit.reservation_service.service;

import com.bus_management_project_kit.reservation_service.client.AuthClient;
import com.bus_management_project_kit.reservation_service.dto.DemandeReservation;
import com.bus_management_project_kit.reservation_service.model.Reservation;
import com.bus_management_project_kit.reservation_service.model.Trajet;
import com.bus_management_project_kit.reservation_service.repository.ReservationRepository;
import com.bus_management_project_kit.reservation_service.repository.TrajetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;
    private final TrajetRepository trajetRepository;
    private final AuthClient authClient;

    public Reservation creerReservation(DemandeReservation demande) {

        if (!authClient.utilisateurExiste(demande.getUtilisateurId())) {
            throw new RuntimeException("Utilisateur introuvable");
        }

        Trajet trajet = trajetRepository.findById(demande.getTrajetId())
                .orElseThrow(() -> new RuntimeException("Trajet introuvable"));

        if (demande.getSiegeNumero() > trajet.getCapacite()) {
            throw new RuntimeException("Numéro de siège invalide");
        }

        boolean siegeOccupe = reservationRepository
                .existsByTrajetIdAndSiegeNumero(demande.getTrajetId(), demande.getSiegeNumero());

        if (siegeOccupe) {
            throw new RuntimeException("Siège déjà réservé");
        }

        Reservation reservation = new Reservation();
        reservation.setUtilisateurId(demande.getUtilisateurId());
        reservation.setTrajetId(demande.getTrajetId());
        reservation.setSiegeNumero(demande.getSiegeNumero());
        reservation.setStatutReservation("EN_ATTENTE");
        reservation.setDateCreation(new Date(System.currentTimeMillis()));
        reservation.setReference("RES-" + UUID.randomUUID().toString().substring(0, 8));
        reservation.setCleIdempotence(UUID.randomUUID().toString());

        return reservationRepository.save(reservation);
    }
}