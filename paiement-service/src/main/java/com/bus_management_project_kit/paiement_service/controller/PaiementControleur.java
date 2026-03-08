package com.bus_management_project_kit.paiement_service.controller;

import com.bus_management_project_kit.paiement_service.dto.DemandePaiement;
import com.bus_management_project_kit.paiement_service.model.Paiement;
import com.bus_management_project_kit.paiement_service.service.PaiementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/paiements")
@RequiredArgsConstructor
public class PaiementControleur {

    private final PaiementService paiementService;

    @PostMapping
    public Paiement creer(@RequestBody DemandePaiement demande) {
        return paiementService.creerPaiement(demande);
    }
}