import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {
    
  Operaciones Calculadora1 = new Operaciones();
        
    public CalculadoraTest() {
    }
    @Test
    public void testSuma1(){
        assertEquals(5,Calculadora1.suma(2,3));      
    }
      @Test
    public void testSuma2(){
        assertEquals(10,Calculadora1.suma(4,6));      
    }
      @Test
    public void testResta1(){
        assertEquals(5,Calculadora1.resta(8,3));      
    }
    public void testResta2(){
        assertEquals(4,Calculadora1.resta(8,4));      
    }
    public void testMultiplicacion1(){
        assertEquals(10,Calculadora1.multiplicacion(2,5));
    }
    public void testMultiplicacion2(){
        assertEquals(6,Calculadora1.multiplicacion(2,3));
    }
    public void testDivision1(){
        assertEquals(10,Calculadora1.division(20,2));
    }
    public void testDivision2(){
        assertEquals(4,Calculadora1.division(20,5));
    }
    public void testExponenciacion1(){
       assertEquals(4,Calculadora1.exponenciacion(2,2));
    }
    public void testExponenciacion2(){
        assertEquals(16,Calculadora1.exponenciacion(4,2));
    }    
}

 