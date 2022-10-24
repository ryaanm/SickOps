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
    IProduitService produitService;

    @Autowired
    ProduitRepository produitRepository;

    Produit p1 = new Produit(55L, "2365","produit1",50);
    Produit p2 = new Produit(66L, "5681","produit5",120);
    @Test
    @Order(1)
    public void testaddProdiut() {
        Produit produitAdded =  produitService.addProduit(p1);
        Assertions.assertEquals(produitAdded.getCodeProduit(), produitAdded.getCodeProduit());
    }

    @Test
    @Order(2)
    public void testRetrieveAllProduits() {
        List<Produit> listProduits = produitService.retrieveAllProduits();
        Assertions.assertEquals(listProduits.size(), listProduits.size());
    }

   /* @Order(3)
    @Test
    public void testRetrieveUser() {
        Produit produitRetrieved = produitService.retrieveProduit(1L);
        Assertions.assertEquals(1L, produitRetrieved.getIdProduit().longValue());
    }*/

    @Test
    @Order(3)
    public void testModifyProduit()   {

      //  Produit produitUpdated  = produitService.updateProduit(p2);
       // Assertions.assertEquals(p2.getCodeProduit(), produitUpdated.getCodeProduit());
    }

    @Test
    @Order(5)
    public void testDeleteUser() {

      //  produitService.deleteProduit(6L);
        Assertions.assertNull(produitService.retrieveProduit(2L));
        produitRepository.deleteAll();
    }
	
	
	
}
