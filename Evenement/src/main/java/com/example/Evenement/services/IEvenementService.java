package com.example.Evenement.services;

import com.example.Evenement.entities.Evenement;

import java.util.List;

public interface IEvenementService {
    // Crud sur les evenements
    public Evenement addEvenement(Evenement e);

    public void deleteEvenement(Long id);

    public Evenement updateEvenement(Evenement p);

    public Evenement findEvenement(Long id);

    public List<Evenement> findAll();

    // Filtrage par propriété
    public List<Evenement> findByTitre(String titre);

    public List<Evenement> findByLieu(String lieu);

}
