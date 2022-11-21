package com.membre.Membre.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue("etd")
public class Etudiant extends Membre{

    @ManyToOne
    private EnseignantChercheur encadrant;
}
