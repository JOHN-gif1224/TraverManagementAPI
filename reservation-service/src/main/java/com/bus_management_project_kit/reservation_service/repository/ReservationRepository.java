package com.bus_management_project_kit.reservation_service.repository;

import com.bus_management_project_kit.reservation_service.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    boolean existsByTrajetIdAndSiegeNumero(Long trajetId, Integer siegeNumero);
}