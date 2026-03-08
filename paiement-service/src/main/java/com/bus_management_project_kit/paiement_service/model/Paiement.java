package com.bus_management_project_kit.paiement_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "paiement")

@Getter
@Setter
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reservationId")
    private String reservationId;

    @Column(name = "montant")
    private Integer montant;

    @Column(name = "moyen")
    private String moyen; // MOMO, CARTE

    @Column(name = "statut")
    private String statut; // SUCCES, ECHEC

    @Column(name = "referenceTransaction")
    private String referenceTransaction;

    @Column(name = "dateCreation")
    private String dateCreation;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Paiement other = (Paiement) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
