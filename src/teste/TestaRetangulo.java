package teste;
import dominio.Retangulo;
import static org.junit.Assert.*;
import org.junit.Test;

public class TestaRetangulo {

    @Test
    public void testCalcularArea() {
          Retangulo calc = new Retangulo(10,5); 
          assertEquals(50, calc.calcularArea(), 0);
        }
    
    @Test
    public void testCalcularPerimetro() {
    	Retangulo calc = new Retangulo(10,5); 
          assertEquals(30, calc.calcularPerimetro(), 0);
        }
}
