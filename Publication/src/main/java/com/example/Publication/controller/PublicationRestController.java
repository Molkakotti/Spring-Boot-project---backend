package com.example.Publication.controller;

import com.example.Publication.entities.Publication;
import com.example.Publication.services.IPublicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class PublicationRestController {
    @Autowired
    IPublicationService PublicationService;

    @RequestMapping(value = "/Publications", method = RequestMethod.GET)
    public List<Publication> findPublications() {
        return PublicationService.findAll();
    }

    @GetMapping(value = "/publication/{id}")
    public Publication findOnePubById(@PathVariable Long id) {
        return PublicationService.findPublication(id);
    }

    @GetMapping(value = "/publication/Search/titre")
    public Publication findPublicationByTitre(@PathVariable String e) {
        return PublicationService.findBytitre(e);
    }

    @PostMapping(value = "/publication/newpub")
    public Publication addPublication(@RequestBody Publication m) {
        return PublicationService.addPublication(m);
    }

    @PutMapping(value = "/publications/publication/{id}")
    public Publication updatePublication(@PathVariable Long id, @RequestBody Publication p) {
        p.setId(id);
        return PublicationService.updatePublication(p);
    }

    @DeleteMapping(value = "/publications/{id}")
    public void deletePublication(@PathVariable Long id) {
        PublicationService.deletePublication(id);
    }

}
