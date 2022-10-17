package com.esprit.examen.services;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Produit;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProduiServiceImplTest {
	@Autowired
	IProduitService ProService;
	Produit p1 = new Produit(55L, "2365","produit1",50);
    Produit p2 = new Produit(66L, "5681","produit5",120);


    List<Produit> listProduits = new ArrayList<Produit>() {
        
     
            add(new Produit(90L, "9687","produit2",30));
            add(new Produit(46L, "4503","produit3",70));
        }
    };
	/*
	
	 @Test
	 public void testRetrieveAllProducts() {
			List<Produit> listProducts = ProService.retrieveAllProduits(); 
			// if there are 7 users in DB : 
			Assert.assertEquals(15, listProducts.size());
	    }
	 
	 @Test
		public void testRetrieveProduct() {
		 Produit produitRetrieved = ProService.retrieveProduit(1L); 
			Assert.assertEquals(1L, produitRetrieved.getIdProduit().longValue());
		}
		*/
	 @Test
	    void testretrieveAllProduits() {
	        Mockito.when(ProService.retrieveAllProduits()).thenReturn(listProduits);
	        List<Produit> listproduit3 = produitService.retrieveAllProduits();
	        assertEquals(3, listproduit3.size());
	        //assertEquals(produit1.getIdProduit(),55L);
	    }

	    @Test
	    void testaddProduit(){
	        Mockito.when(produitRepository.save(p1)).thenReturn(p1);
	        Produit produit1 = produitService.addProduit(p1);
	        //assertNotNull(produit1);
	        Mockito.verify(produitRepository, times(1)).save(Mockito.any(Produit.class));
	    }
	
	
}
