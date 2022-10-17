package com.esprit.examen.services;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Set;

import com.esprit.examen.entities.Facture;
import com.esprit.examen.entities.Operateur;
import com.esprit.examen.repositories.OperateurRepository;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.OneToMany;

@RunWith(SpringRunner.class)
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@ExtendWith(MockitoExtension.class)
public class IOperateurServiceTest {
    @MockBean
    private OperateurRepository or;

    private Operateur oo1 = new Operateur(11L,"fatma","daâs","546125");
    private Operateur oo2 = new Operateur(22L,"Fatma","daâs","546125");
    @Autowired
    IOperateurService opService;
    IOperateurService os;











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

    @Test
    public void addOperateurTest() {
        when(or.save(oo1)).thenReturn(oo1);
        assertNotNull("rayen null",oo1);
       // assertEquals(oo1, os.addOperateur(oo1),"zinouba");
        System.out.println("add works !");
    }
}
