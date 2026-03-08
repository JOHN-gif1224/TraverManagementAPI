package com.bus_management_project_kit.reservation_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemandeReservation {

    private Long utilisateurId;
    private Long trajetId;
    private Integer siegeNumero;
}