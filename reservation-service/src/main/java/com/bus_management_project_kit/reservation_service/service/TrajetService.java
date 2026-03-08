package com.bus_management_project_kit.reservation_service.service;

import com.bus_management_project_kit.reservation_service.model.Trajet;
import com.bus_management_project_kit.reservation_service.repository.TrajetRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class TrajetService {

    private final TrajetRepository trajetRepository;

    public Trajet creerTrajet(Trajet trajet) {
        if (trajet.getHeureDepart() == null) {
            trajet.setHeureDepart(new Date(System.currentTimeMillis()));
        }
        return trajetRepository.save(trajet);
    }
}