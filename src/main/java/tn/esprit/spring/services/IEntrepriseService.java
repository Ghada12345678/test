package tn.esprit.spring.services;

import java.util.List;
import tn.esprit.spring.entities.Departement;
import tn.esprit.spring.entities.Entreprise;

public interface IEntrepriseService {
	public List<Entreprise> retrieveAllEntreprises();
	public Entreprise addEntreprise(Entreprise e);
	public Entreprise updateEntreprise(Entreprise e);
	public void deleteEntreprise(String id);
	public Entreprise retrieveEntreprise(String id);
	

}
