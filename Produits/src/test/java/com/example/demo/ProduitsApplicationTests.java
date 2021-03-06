package com.example.demo;

import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.entites.Produit;
import com.example.demo.repos.ProduitRepository;

@SpringBootTest
class ProduitsApplicationTests {
	
	@Autowired
	private ProduitRepository produitRepository;
	
	@Test
	public void testListerTousProduits()
	{
	List<Produit> prods = produitRepository.findAll();
	for (Produit p : prods)
	{
	   System.out.println(p);
	}

	}
}
