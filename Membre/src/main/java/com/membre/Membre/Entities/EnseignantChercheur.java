package com.membre.Membre.Entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("enc")
public class EnseignantChercheur extends Membre{

    private static final long serialVersionUID=1;
    private String grade;
    private String etablissement;

    @OneToMany(mappedBy = "encadrant")
    private List <Etudiant> etudiants;
}
