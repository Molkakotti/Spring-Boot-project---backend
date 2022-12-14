package com.example.Evenement.controller;

import com.example.Evenement.entities.Evenement;
import com.example.Evenement.services.IEvenementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class EventRestController {
    @Autowired
    IEvenementService eventService;

    @RequestMapping(value = "/events", method = RequestMethod.GET)
    public List<Evenement> findEvents() {
        return eventService.findAll();
    }

    @GetMapping(value = "/event/{id}")
    public Evenement findOneEventById(@PathVariable Long id) {
        return eventService.findEvenement(id);
    }

    @GetMapping(value = "/events/Search/titre")
    public List<Evenement> findEventByTitre(@PathVariable String e) {
        return eventService.findByTitre(e);
    }

    @PostMapping(value = "/events/evenement")
    public Evenement addEvenement(@RequestBody Evenement m) {
        return eventService.addEvenement(m);
    }

    @PutMapping(value = "/events/evenement/{id}")
    public Evenement updateEvenement(@PathVariable Long id, @RequestBody Evenement p) {
        p.setId(id);
        return eventService.updateEvenement(p);
    }

    @DeleteMapping(value = "/events/{id}")
    public void deleteEvenement(@PathVariable Long id) {
        eventService.deleteEvenement(id);
    }

}
