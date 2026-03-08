package com.bus_management_project_kit.reservation_service.controller;

import com.bus_management_project_kit.reservation_service.model.Trajet;
import com.bus_management_project_kit.reservation_service.service.TrajetService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/trajets")
@RequiredArgsConstructor
public class TrajetControleur {

    private final TrajetService trajetService;

    @PostMapping
    public Trajet creer(@RequestBody Trajet trajet) {
        return trajetService.creerTrajet(trajet);
    }
}