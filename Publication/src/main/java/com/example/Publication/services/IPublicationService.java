package com.example.Publication.services;

import com.example.Publication.entities.Publication;

import java.util.List;

public interface IPublicationService {
    public Publication addPublication(Publication p);

    public void deletePublication(Long id);

    public Publication updatePublication(Publication p);

    public Publication  findPublication (Long id);

    public List<Publication> findAll();

    // Filtrage par propriété
    public Publication findBytitre(String titre);

    public Publication  findBytype(String type);



}
