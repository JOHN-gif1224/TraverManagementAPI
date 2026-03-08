package com.bus_management_project_kit.reservation_service.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(uniqueConstraints = {
        @UniqueConstraint(columnNames = { "trajetId", "numeroSiege" }),
        @UniqueConstraint(columnNames = { "cleIdempotence" })
})

@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "reference")
    private String reference;

    @Column(name = "cleIdempotence")
    private String cleIdempotence;

    @Column(name = "utilisateurId")
    private Long utilisateurId; // EMAIL ISSU JWT

    @Column(name = "trajetId")
    private Long trajetId;

    @Column(name = "siegeNumero")
    private Integer siegeNumero;

    @Column(name = "statutReservation")
    private String statutReservation; // EN_ATTENTE / CONFIRMÉE / ANNULLÉE

    @Column(name = "dateCreation")
    private Date dateCreation;

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
        Reservation other = (Reservation) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    

}
