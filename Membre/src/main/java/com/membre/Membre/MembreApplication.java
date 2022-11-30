package com.membre.Membre;

import com.membre.Membre.DAO.MembreRepository;
import com.membre.Membre.Entities.EnseignantChercheur;
import com.membre.Membre.Entities.Etudiant;
import com.membre.Membre.Entities.Membre;
import com.membre.Membre.services.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.SimpleDateFormat;
import java.util.Date;

@SpringBootApplication
public class MembreApplication implements CommandLineRunner {

	@Autowired
	MembreRepository memberRepository;

	@Autowired
	IMemberService memberService;

	public static void main(String[] args) {
		SpringApplication.run(MembreApplication.class, args);
	}

	public void run (String... args) throws Exception {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd");
		Date date1	=dateFormatter.parse("2010-05-01");
		Date date2	=dateFormatter.parse("2010-04-02");
		Date date3	=dateFormatter.parse("2011-03-05");
		Date date4	=dateFormatter.parse("2009-08-06");
		Date date5	=dateFormatter.parse("2012-05-02");
		Etudiant etd1 = new Etudiant("0987654", "ben fekih","rim","","rim@enis.rn","1111",date1,null);
		Etudiant etd2 = new Etudiant("09876544", "ben fekih","sana","","sana@enis.rn","1111",date1,null);
		Etudiant etd3 = new Etudiant("11962485", "Mejri","maryem","","maryem.mejri@enis.tn","111",date3,null);
		Etudiant etd4 = new Etudiant("0987663", "Dardour","ahmed","","ahmed.dardour@enis.tn","11",date4,null);
		EnseignantChercheur ens1 = new EnseignantChercheur("098254", "oukil", "sihem", "","sihem.oukil@enis.tn","sihem123",date5, null);


		memberRepository.save(etd1);
		memberRepository.save(etd2);
		memberRepository.save(etd3);
		memberRepository.save(etd4);
		memberRepository.save(ens1);
		// Update a Member
		Membre m= memberService.findMember(1L);
		m.setCv("cv1.pdf");
		memberService.updateMember(m);
		// Delete a Member
		memberService.deleteMember(2L); // supprimer la ligne2
		memberService.affectEtudiantToEnseignant(1L,5L) ;//affecter a un etudiant un encadrant

	}


}