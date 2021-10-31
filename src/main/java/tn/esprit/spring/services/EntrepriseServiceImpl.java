package tn.esprit.spring.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.repository.EntrepriseRepository;

@Service
public class EntrepriseServiceImpl implements IEntrepriseService {
	
	@Autowired
    EntrepriseRepository entrepriseRepoistory;
	@Autowired
	DepartementRepository deptRepoistory;
	private static final Logger l = LogManager.getLogger(EntrepriseServiceImpl.class);

	
	@Override
	public List<Entreprise> retrieveAllEntreprises() { 
		List<Entreprise> entreprises = null; 
		try {
	
			l.info("In retrieveAllEntreprises() : ");
			entreprises = (List<Entreprise>) entrepriseRepoistory.findAll();  
			for (Entreprise entreprise : entreprises) {
				l.debug("entreprise +++ : " + entreprise);
			} 
			l.info("Out of retrieveAllEntreprises() : ");
		}catch (Exception e) {
			l.error("Error in retrieveAllEntreprises() : " + e);
		}

		return entreprises;
	}


	@Override
	public Entreprise addEntreprise(Entreprise e) {
		return entrepriseRepoistory.save(e); 
	}

	@Override 
	public Entreprise updateEntreprise(Entreprise e) { 
		return entrepriseRepoistory.save(e);
	}

	@Override
	public void deleteEntreprise(String id) {
		entrepriseRepoistory.deleteById(Long.parseLong(id));
	}

	@Override
	public Entreprise retrieveEntreprise(String id) {
		l.info("in  retrieveEntreprise id = " + id);
		//Entreprise e =  entrepriseRepository.findById(Long.parseLong(id)).orElse(null);
		//int i = 1/0; 
		Entreprise e =  entrepriseRepoistory.findById(Long.parseLong(id)).get(); 
		l.info("entreprise returned : " + e);
		return e; 
	}


}