package com.bus_management_project_kit.auth_service.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "utilisateur")

@Getter
@Setter
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom", nullable = false, length = 80)
    private String nom;

    @Column(name = "email", nullable = false, length = 80)
    private String email;

    @Column(name = "motDePasseHash", nullable = false, length = 80)
    private String motDePasseHash;

    @Column(name = "roleUtilisateur", nullable = false, length = 80)
    private String roleUtilisateur;

    @Column(name = "dateCreation")
    private Date dateCreation;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        result = prime * result + ((nom == null) ? 0 : nom.hashCode());
        result = prime * result + ((email == null) ? 0 : email.hashCode());
        result = prime * result + ((motDePasseHash == null) ? 0 : motDePasseHash.hashCode());
        result = prime * result + ((roleUtilisateur == null) ? 0 : roleUtilisateur.hashCode());
        result = prime * result + ((dateCreation == null) ? 0 : dateCreation.hashCode());
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
        Utilisateur other = (Utilisateur) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        if (nom == null) {
            if (other.nom != null)
                return false;
        } else if (!nom.equals(other.nom))
            return false;
        if (email == null) {
            if (other.email != null)
                return false;
        } else if (!email.equals(other.email))
            return false;
        if (motDePasseHash == null) {
            if (other.motDePasseHash != null)
                return false;
        } else if (!motDePasseHash.equals(other.motDePasseHash))
            return false;
        if (roleUtilisateur == null) {
            if (other.roleUtilisateur != null)
                return false;
        } else if (!roleUtilisateur.equals(other.roleUtilisateur))
            return false;
        if (dateCreation == null) {
            if (other.dateCreation != null)
                return false;
        } else if (!dateCreation.equals(other.dateCreation))
            return false;
        return true;
    }

}