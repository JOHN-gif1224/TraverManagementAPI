package com.bus_management_project_kit.paiement_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bus_management_project_kit.paiement_service.model.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement, Long>{

}
