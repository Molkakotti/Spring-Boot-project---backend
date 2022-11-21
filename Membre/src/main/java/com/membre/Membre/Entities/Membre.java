package com.membre.Membre.Entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_mbr",discriminatorType= DiscriminatorType.STRING, length = 3)

public abstract class Membre implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String cin;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;

    public Membre(Long id, @NonNull String cin, @NonNull String nom, @NonNull String prenom, @NonNull Date dateNaissance) {
        this.id = id;
        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissance = dateNaissance;
    }

    public Membre() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @NonNull
    public String getCin() {
        return cin;
    }

    public void setCin(@NonNull String cin) {
        this.cin = cin;
    }

    @NonNull
    public String getNom() {
        return nom;
    }

    public void setNom(@NonNull String nom) {
        this.nom = nom;
    }

    @NonNull
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(@NonNull String prenom) {
        this.prenom = prenom;
    }

    @NonNull
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public void setDateNaissance(@NonNull Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    @NonNull
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

}
