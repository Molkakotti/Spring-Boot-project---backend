package com.example.Evenement.services;

import com.example.Evenement.dao.EvenementRepository;
import com.example.Evenement.entities.Evenement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementImp implements IEvenementService {
    @Autowired
    EvenementRepository event;

    @Override
    public Evenement addEvenement(Evenement e) {
        event.save(e);
        return e;
    }

    @Override
    public void deleteEvenement(Long id) {
        if(event.findById(id).isPresent())
            event.deleteById(id);
    }


    @Override
    public Evenement updateEvenement(Evenement p) {
        return event.saveAndFlush(p);
    }

    @Override
    public Evenement findEvenement(Long id) {
        Evenement m = (Evenement) event.findById(id).get();
        return m;
    }

    @Override
    public List<Evenement> findAll() {
        return event.findAll();
    }

    @Override
    public List<Evenement> findByTitre(String titre) {
        return event.findByTitre(titre);

    }

    @Override
    public List<Evenement> findByLieu(String lieu) {
        return event.findByLieu(lieu);
    }

}

