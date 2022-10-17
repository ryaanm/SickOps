package com.esprit.examen.services;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import com.esprit.examen.entities.Produit;
import com.esprit.examen.repositories.ProduitRepository;


@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class ProduiServiceImplTest {
	@Autowired
	IProduitService ProService;
	@MockBean
	ProduitRepository produitRepository;
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
	
	
	Produit p1 = new Produit(55L, "2365","produit1",50);
    Produit p2 = new Produit(66L, "5681","produit5",120);


    List<Produit> listProduits = new ArrayList<Produit>(){ 
    	{
            add(new Produit(90L, "9687","produit2",30));
            add(new Produit(46L, "4503","produit3",70));
    }
    };
    
    @Test
    void testretrieveAllProduits() {
        Mockito.when(produitRepository.findAll()).thenReturn(listProduits);
        List<Produit> listproduit3 = ProService.retrieveAllProduits();
        assertEquals(3, listproduit3.size());
        //assertEquals(produit1.getIdProduit(),55L);
    }

    @Test
    void testaddProduit(){
        Mockito.when(produitRepository.save(p1)).thenReturn(p1);
        Produit produit1 = ProService.addProduit(p1);
        //assertNotNull(produit1);
        Mockito.verify(produitRepository, times(1)).save(Mockito.any(Produit.class));
    }
	
	
	
}
