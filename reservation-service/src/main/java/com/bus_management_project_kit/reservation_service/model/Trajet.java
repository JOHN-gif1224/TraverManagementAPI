package com.bus_management_project_kit.reservation_service.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trajet")
public class Trajet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "depart")
    private String depart;

    @Column(name = "arrivee")
    private String arrivee;

    @Column(name = "heureDepart")
    private Date heureDepart;

    @Column(name = "prix")
    private Integer prix;

    @Column(name = "capacite")
    private Integer capacite;

}
