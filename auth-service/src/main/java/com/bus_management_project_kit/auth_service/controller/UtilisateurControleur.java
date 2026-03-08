package com.bus_management_project_kit.auth_service.controller;

import com.bus_management_project_kit.auth_service.model.Utilisateur;
import com.bus_management_project_kit.auth_service.service.UtilisateurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/utilisateurs")
@RequiredArgsConstructor
public class UtilisateurControleur {

    private final UtilisateurService utilisateurService;

    @PostMapping
    public Utilisateur creer(@RequestBody Utilisateur utilisateur) {
        return utilisateurService.creerUtilisateur(utilisateur);
    }

    @GetMapping("/existe/{id}")
    public boolean existe(@PathVariable Long id) {
        return utilisateurService.utilisateurExiste(id);
    }
}