package com.example.Evenement.dao;

import com.example.Evenement.entities.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EvenementRepository extends JpaRepository<Evenement, Long> {
    List<Evenement> findByTitre(String titre);
    List<Evenement> findByLieu(String lieu);

    List<Evenement> findByLieuStartingWith(String caractere);

}
