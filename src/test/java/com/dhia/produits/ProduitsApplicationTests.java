package com.dhia.produits;

import com.dhia.produits.entities.Produit;
import com.dhia.produits.repos.ProduitRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@SpringBootTest
class ProduitsApplicationTests {

	@Autowired
	private ProduitRepository produitRepository;
	@Test
	public void testCreateProduit(){
	Produit prod=new Produit("PC DELL",2200.500,new Date());
	produitRepository.save(prod);
	}
	@Test
	public void testFindProduit(){
		Produit p=produitRepository.findById(1L).get();
		System.out.println(p);
	}
	@Test
	public void testUpdateProduit(){
		Produit p=produitRepository.findById(1L).get();
		p.setPrixProduit(2000.0);
		produitRepository.save(p);
		System.out.println(p);




	}
	@Test
	public void testDeleteProduit(){
		produitRepository.deleteById(1L);

	}
	@Test
	public void testAfficherProduit(){
		List<Produit> prods=produitRepository.findAll();
		for (Produit p:prods)
			System.out.println(p);


	}



}
