package com.membre.Membre.DAO;

import com.membre.Membre.Entities.Membre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MembreRepository extends JpaRepository<Membre,Long> {
    Membre findByCin(String cin);
    List<Membre> findByNomStartingWith(String caractere);
    Membre findByEmail(String email);
}
