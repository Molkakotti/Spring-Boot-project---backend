package com.membre.Membre.DAO;

import com.membre.Membre.Entities.Membre_Publication;
import com.membre.Membre.Entities.PublicationMembreId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Membrepubrepository extends JpaRepository<Membre_Publication, PublicationMembreId> {
    @Query("select m from Membre_Publication m where auteur_id=:x")
    List<Membre_Publication> findpubId(@Param("x") Long autId);
}
