package com.membre.Membre.DAO;

import com.membre.Membre.Entities.EnseignantChercheur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EnseignantChercheurRepository extends JpaRepository<EnseignantChercheur,Long> {
    List<EnseignantChercheur>findByGrade(String grade);
    List<EnseignantChercheur> findByEtablissement(String etablissement);
}
