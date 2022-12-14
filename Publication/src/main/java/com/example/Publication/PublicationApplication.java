package com.example.Publication;

import com.example.Publication.dao.PublicationRepository;
import com.example.Publication.entities.Publication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import java.util.Date;

@SpringBootApplication
@EnableDiscoveryClient
public class PublicationApplication implements CommandLineRunner {
	@Autowired
	PublicationRepository publicationRepository;
	@Autowired
	RepositoryRestConfiguration repositoryRestConfig;

	public static void main(String[] args) {
		SpringApplication.run(PublicationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repositoryRestConfig.exposeIdsFor(Publication.class);
		Publication pub1 = new Publication("service oriented architecture", "aaa", "book","bbb",new Date(20,02,2021));
		publicationRepository.save(pub1);
		@SuppressWarnings("deprecation")
		Publication pub2= new Publication("bitcoin", "book","white paper","book2",new Date(19,11,2021));
		publicationRepository.save(pub2);


	}

}
