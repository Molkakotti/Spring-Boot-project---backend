package com.membre.Membre.Entities;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;

@Entity
public class Membre_Publication {
    @EmbeddedId
    private Membre_Pub_Ids id;
    @ManyToOne
    @MapsId("auteur_id")
    private Membre auteur;
}
