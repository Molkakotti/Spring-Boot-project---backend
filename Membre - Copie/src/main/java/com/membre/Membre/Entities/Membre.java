package com.membre.Membre.Entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Inheritance(strategy= InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_mbr",discriminatorType= DiscriminatorType.STRING, length = 3)

public abstract class Membre implements Serializable {
    private static final long serialVersionUID =1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String cin;

    @NonNull
    private String nom;

    @NonNull
    private String prenom;


    @NonNull
    private String cv;

    @NonNull
    private String email;

    @Lob
    private byte [] photo;

    @NonNull
    private String password;

    @NonNull
    public String getCv() {
        return cv;
    }

    @NonNull
    @Temporal(TemporalType.DATE)
    private Date dateNaissance;

    public void setCv(@NonNull String cv) {
        this.cv = cv;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public byte[] getPhoto() {
        return photo;
    }
    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }

    public Membre( String cin, String nom, String prenom, String cv, String email, String password, Date dateNaissance,
                   byte[] photo) {
        super();

        this.cin = cin;
        this.nom = nom;
        this.prenom = prenom;
        this.cv = cv;
        this.email = email;
        this.password = password;
        this.dateNaissance = dateNaissance;
        this.photo = photo;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }



    public Membre() {
        super();
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



}
