package com.bus_management_project_kit.auth_service.service;

import com.bus_management_project_kit.auth_service.model.Utilisateur;
import com.bus_management_project_kit.auth_service.repository.UtilisateurRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
@RequiredArgsConstructor
public class UtilisateurService {

    private final UtilisateurRepository utilisateurRepository;

    public Utilisateur creerUtilisateur(Utilisateur utilisateur) {
        // Initialisation automatique de la date de création si non fournie
        if (utilisateur.getDateCreation() == null) {
            utilisateur.setDateCreation(new Date(System.currentTimeMillis()));
        }
        return utilisateurRepository.save(utilisateur);
    }

    public boolean utilisateurExiste(Long id) {
        return utilisateurRepository.existsById(id);
    }
}