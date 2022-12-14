package com.example.Publication.dao;

import com.example.Publication.entities.Publication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublicationRepository extends JpaRepository<Publication, Long> {
    Publication findByTitre(String titre);
    Publication findByType(String type);

}
