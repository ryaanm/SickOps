package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.Set;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Operateur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.OneToMany;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IOperateurServiceTest {
    @Autowired
    IOperateurService opService;
   // @Test
  //  public void testAddop() {


      //  Operateur o = new Operateur(123l,"op","zeineb","zeineb");
       // Operateur savedop= opService.addOperateur(o);
      //  assertNotNull(savedop.getNom());
      //  assertSame(123l, savedop.getIdOperateur());
      //  assertNotNull(savedStock.getIdStock());
      //  assertSame(10, savedStock.getQte());
        //assertTrue(savedop.getQteMin()>0);
       // stockService.deleteStock(savedStock.getIdStock());
      //  opService.deleteOperateur(savedop.getIdOperateur());

    //}
   

    @Test
    public void assertNotNullWithMessage() {
        Operateur o = new Operateur(123l,"op","zeineb","zeineb");
        Operateur savedop= opService.addOperateur(o);

        Operateur actualop = opService.retrieveOperateur(1l);
        assertNotNull(actualop, "op is null !");
    }
    @Test
    public void assertEqualsWithMessage() {
        Operateur o = new Operateur(123l,"op","zeineb","zeineb");
        Operateur savedop= opService.addOperateur(o);
        Operateur o1 = new Operateur(123l,"op","zeineb","zeineb");
        Operateur savedop1= opService.addOperateur(o);

        Operateur actualop = opService.retrieveOperateur(1l);

        assertEquals(1l, actualop.getIdOperateur());

    }
}
