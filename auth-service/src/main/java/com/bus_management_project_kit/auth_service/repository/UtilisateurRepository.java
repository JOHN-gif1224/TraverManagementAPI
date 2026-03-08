package com.bus_management_project_kit.auth_service.repository;

import com.bus_management_project_kit.auth_service.model.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
    // Pas de méthodes supplémentaires pour l'instant (comme dans le TP)
}