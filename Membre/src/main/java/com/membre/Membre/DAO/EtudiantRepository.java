package com.membre.Membre.DAO;

import com.membre.Membre.Entities.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    List<Etudiant>findByDiplome(String diplome);
    List<Etudiant> findByDiplomeOrderByDateInscriptionDesc(String diplome);
}
