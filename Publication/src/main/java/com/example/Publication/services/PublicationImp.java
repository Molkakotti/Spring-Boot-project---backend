package com.example.Publication.services;

import com.example.Publication.dao.PublicationRepository;
import com.example.Publication.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PublicationImp implements IPublicationService {

    @Autowired
    PublicationRepository publicationRepository;

    @Override
    public Publication addPublication(Publication p) {
        publicationRepository.save(p);
        return p;

    }

    @Override
    public void deletePublication(Long id) {
        if(publicationRepository.findById(id).isPresent())
            publicationRepository.deleteById(id);
    }



    @Override
    public Publication updatePublication(Publication p) {
        return publicationRepository.saveAndFlush(p);
    }

    @Override
    public Publication findPublication(Long id) {
        Publication p = (Publication)publicationRepository .findById(id).get();
        return p;
    }

    @Override
    public List<Publication> findAll() {
        return publicationRepository.findAll();
    }

    @Override
    public Publication findBytitre(String titre) {

        return publicationRepository.findByTitre(titre);
    }

    @Override
    public Publication findBytype(String type) {

        return publicationRepository.findByType(type);
    }

}
