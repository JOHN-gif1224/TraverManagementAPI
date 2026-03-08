package com.bus_management_project_kit.paiement_service.repository;

import com.bus_management_project_kit.paiement_service.model.Paiement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}