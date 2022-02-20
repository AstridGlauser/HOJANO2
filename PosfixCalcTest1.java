/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */


import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author imarg
 */
public class PosfixCalcTest {
    @Test
 	 public void testEvalute() {
	
                PosfixCalc Calculadora = new PosfixCalc();
                int numero=Calculadora.Evaluate("1 2 + 4 * 3 + ");
		assertEquals(15,numero);
	}
         
         
          @Test
 	 public void testEvalute2() {
	
                PosfixCalc Calculadora = new PosfixCalc();
                int numero=Calculadora.Evaluate("4 5 * ");
		assertEquals(20,numero);
	}
         
          @Test
          public void testEvalute3() {
		
                PosfixCalc Calculadora = new PosfixCalc();
                int numero=Calculadora.Evaluate("6 2 3 + * ");
		assertEquals(30,numero);
	}
            @Test
            public void testEvalute4() {
		
                PosfixCalc Calculadora = new PosfixCalc();
                int numero=Calculadora.Evaluate("1 2 + 4 * 3 + 4 * 6 / 5 * ");
		assertEquals(50,numero);
	}
            
            
               @Test
            public void testEvalute5() {
		
                PosfixCalc Calculadora = new PosfixCalc();
                
                int numero=Calculadora.Evaluate("1 2 + 4 * 3 + 4 * 6 / 5 * + ");
		assertEquals(0,numero);
	}
}
