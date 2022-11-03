package com.esprit.examen.services;



import java.text.ParseException;
import java.util.List;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Fournisseur;

import lombok.extern.slf4j.Slf4j;


import org.junit.Test;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class FactureServiceImplTest {

	@Autowired
	IFactureService FactureService;
	
	
	@Test
	public void testAddfacture() throws ParseException {
		Facture f = new Facture();
		Fournisseur fn= new Fournisseur();
		
		
		
		f.setMontantFacture(55.5f);
		f.setDateCreationFacture(java.sql.Date.valueOf("2022-09-04"));
		f.setDateDerniereModificationFacture(java.sql.Date.valueOf("2022-09-05"));
		f.setArchivee(true);
		f.setIdFacture(18L);
		f.setMontantRemise(22f);
		f.setFournisseur(fn);
	    
		FactureService.addFacture(f);
		log.info("facture ajouter avec success");
	}
	
	
	@Test
	public void testRetrieveAllFacture() throws ParseException {
		List<Facture> listFacture = FactureService.retrieveAllFactures();
		log.info("Nombre facture: " + listFacture.size()+" \n");
		for(int i=0;i<listFacture.size();i++){
			log.info(""+listFacture.get(i).getMontantFacture());
		}
	}
	
	
	
	
	/*@Test
	public void testModifierCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT2");
		cat.setLibelleCategorie("categorie 2");
		categorieProduitService.addCategorieProduit(cat);
		log.info("categorie ajouter avec success");
		cat.setCodeCategorie("CAT5");
		cat.setLibelleCategorie("categorie 5");
		categorieProduitService.updateCategorieProduit(cat);
		log.info("categorie modifier avec success");
	}
	
	@Test
	public void testDeleteCategorie() throws ParseException {
		CategorieProduit cat = new CategorieProduit();
		cat.setCodeCategorie("CAT2");
		cat.setLibelleCategorie("categorie");
		categorieProduitService.addCategorieProduit(cat);
		categorieProduitService.deleteCategorieProduit(cat.getIdCategorieProduit());
		log.info("categorie supprimer avec success");
	}
	
	@Test
	public void testRetrieveAllCategorie() throws ParseException {
		List<CategorieProduit> listCategorie = categorieProduitService.retrieveAllCategorieProduits();
		log.info("Nombre categorie: " + listCategorie.size()+" \n");
		for(int i=0;i<listCategorie.size();i++){
			log.info(""+listCategorie.get(i).getLibelleCategorie());
		}
	}
	*/
	
	
	
	
}