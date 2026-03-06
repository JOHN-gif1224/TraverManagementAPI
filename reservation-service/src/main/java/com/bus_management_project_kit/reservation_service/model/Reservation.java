package com.bus_management_project_kit.reservation_service.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = {
    @UniqueConstraint(columnNames = {"trajetId", "numeroSiege"}),
    @UniqueConstraint(columnNames = {"cleIdempotence"})
})
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "utilisateurId")
    private String utilisateurId; // EMAIL ISSU JWT

    @Column(name = "trajetId")
    private String trajetId;

    @Column(name = "numeroSiege")
    private Integer numeroSiege;

    @Column(name = "statut")
    private String statut; // EN_ATTENTE / CONFIRMÉE / ANNULLÉE

    @Column(name = "cleIdempotence")
    private String cleIdempotence;

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
