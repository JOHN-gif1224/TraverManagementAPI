package com.bus_management_project_kit.reservation_service.controller;

import com.bus_management_project_kit.reservation_service.dto.DemandeReservation;
import com.bus_management_project_kit.reservation_service.model.Reservation;
import com.bus_management_project_kit.reservation_service.service.ReservationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reservations")
@RequiredArgsConstructor
public class ReservationControleur {

    private final ReservationService reservationService;

    @PostMapping
    public Reservation creer(@RequestBody DemandeReservation demande) {
        return reservationService.creerReservation(demande);
    }
}