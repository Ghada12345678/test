package tn.esprit.spring.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.entities.Role;
import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.EntrepriseRepository;
import tn.esprit.spring.services.EntrepriseServiceImpl;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EntrepriseServiceImplTest {
	@Autowired
	EntrepriseServiceImpl es;
	@Autowired
	EntrepriseRepository er;
	
	
	@Test
	public void testRetrieveAllEntreprises() {
		List<Entreprise> listEntreprises = es.retrieveAllEntreprises(); 
		// if there are 7 entreprises in DB : 
		Assert.assertEquals(0, listEntreprises.size());
	}
	
	/*
	@Test
	public void testAddEntreprise() throws ParseException {
		
		Entreprise e = new Entreprise( "ghada", "ghada"); 
		Entreprise entrepriseAdded = es.addEntreprise(e); 
		Assert.assertEquals(e.getName(), entrepriseAdded.getName());
	}
	
 
	@Test
	public void testModifyEntreprise() throws ParseException   {
		Entreprise e = new Entreprise(4L, "ghada122222222", "ghada"); 
		Entreprise entrepriseUpdated  = es.updateEntreprise(e); 
		Assert.assertEquals(e.getName(), entrepriseUpdated.getName());
	}
	

	@Test
	public void testRetrieveEntreprise() {
		Entreprise entrepriseRetrieved = es.retrieveEntreprise("4"); 
		Assert.assertEquals(4L, entrepriseRetrieved.getId().longValue());
	}
	
	
	@Test
	public void testDeleteEntreprise() {
		es.deleteEntreprise("3");
		Assert.assertNull(es.retrieveEntreprise("3"));
	}
	
	// 5 tests unitaires  

*/

}
