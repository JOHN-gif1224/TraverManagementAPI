package com.bus_management_project_kit.reservation_service.repository;

import com.bus_management_project_kit.reservation_service.model.Trajet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrajetRepository extends JpaRepository<Trajet, Long> {
}