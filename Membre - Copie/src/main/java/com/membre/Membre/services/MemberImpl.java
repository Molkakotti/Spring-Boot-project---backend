package com.membre.Membre.services;

import com.membre.Membre.Entities.EnseignantChercheur;
import com.membre.Membre.Entities.Etudiant;
import com.membre.Membre.Entities.Membre;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class MemberImpl {
    @Autowired
    MemberRepository memberRepository;
    @Autowired
    EtudiantRepository etudiantRepository;
    @Autowired
    EnseignantChercheurRepository enseignantChercheurRepository;
    @Override
    public Membre addMember(Membre m) {
        // TODO Auto-generated method stub
        memberRepository.save(m);
        return m;

    }

    @Override
    public void deleteMember(Long id) {
        // TODO Auto-generated method stub
        memberRepository.deleteById(id);

    }

    @Override
    public Membre updateMember(Membre m) {
        // TODO Auto-generated method stub
        return memberRepository.saveAndFlush(m);

    }

    @Override
    public Membre findMember(Long id) {
        // TODO Auto-generated method stub
        Membre m= (Membre)memberRepository.findById(id).get();
        return m;

    }

    @Override
    public List<Membre> findAll() {
        // TODO Auto-generated method stub
        return memberRepository.findAll();}



    @Override
    public Membre findByCin(String cin) {
        // TODO Auto-generated method stub
        return memberRepository.findByCin(cin);}


    @Override
    public Membre findByEmail(String email) {
        // TODO Auto-generated method stub
        return memberRepository.findByEmail(email);

    }

    @Override
    public List<Membre> findByNom(String nom) {
        // TODO Auto-generated method stub
        return memberRepository.findByNomStartingWith(nom);

    }

    @Override
    public List<Etudiant> findByDiplome(String diplome) {

        // TODO Auto-generated method stub
        return etudiantRepository.findByDiplome(diplome);
    }

    @Override
    public List<EnseignantChercheur> findByGrade(String grade) {
        // TODO Auto-generated method stub
        return enseignantChercheurRepository.findByGrade(grade);
    }

    @Override
    public List<EnseignantChercheur> findByEtablissement(String etablissement) {
        // TODO Auto-generated method stub
        return enseignantChercheurRepository.findByEtablissement(etablissement);
    }
    @Override
    public void affectEtudiantToEnseignant(long idEtudiant, long idEnseignant) {
        Etudiant etud = (Etudiant) memberRepository.findById(idEtudiant).get();
        EnseignantChercheur ens = (EnseignantChercheur) memberRepository.findById(idEnseignant).get();
        etud.setEncadrant(ens);
        memberRepository.save(etud);

    }
}
