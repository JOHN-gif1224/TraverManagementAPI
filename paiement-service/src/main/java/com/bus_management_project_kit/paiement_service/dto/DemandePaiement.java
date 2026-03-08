package com.bus_management_project_kit.paiement_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DemandePaiement {

    private Long reservationId;
    private Integer montant;
    private String moyen;   // "MOMO" ou "CARTE"
}