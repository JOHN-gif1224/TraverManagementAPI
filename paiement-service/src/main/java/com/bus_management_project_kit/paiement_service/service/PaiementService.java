package com.bus_management_project_kit.paiement_service.service;

import com.bus_management_project_kit.paiement_service.dto.DemandePaiement;
import com.bus_management_project_kit.paiement_service.model.Paiement;
import com.bus_management_project_kit.paiement_service.repository.PaiementRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PaiementService {

    private final PaiementRepository paiementRepository;

    public Paiement creerPaiement(DemandePaiement demande) {

        Paiement paiement = new Paiement();

        paiement.setReservationId(demande.getReservationId());
        paiement.setMontant(demande.getMontant());
        paiement.setMoyen(demande.getMoyen());
        paiement.setStatut("EN_ATTENTE");                                   // statut par défaut
        paiement.setReferenceTransaction("PAY-" + UUID.randomUUID().toString().substring(0, 12));
        paiement.setDateCreation(new Date(System.currentTimeMillis()).toString()); // format String

        return paiementRepository.save(paiement);
    }
}