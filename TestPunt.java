import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestPunt {
    @Test
    public void testPuntConstructor() {
        // comprova que el constructor Punt() pugui ser cridat
        Punt p = new Punt();
    }

    @Test
    public void testPuntBuit() {
        // comprova que el constructor Punt() deixi a 0 els valors
        Punt p = new Punt();
        assertEquals(0, p.getX()); // Afirma que la coordenada x val 0
        assertEquals(0, p.getY());
    }
    
    @Test
    public void testPuntSet() {
    	// comprova que els mètodes setX() i setY() assignen correctament
    	Punt p = new Punt();
    	p.setX(3); // Assignem valors
    	p.setY(4);
    	assertEquals(3, p.getX()); // Afirma que els valors assignats són correctes
    	assertEquals(4, p.getY());
    }
    
    @Test
    public void testPuntDefinit() {
        // comprova que el constructor Punt(int,int) deixi els valors correctes
        Punt p = new Punt(3, 4);
        assertEquals(3, p.getX());
        assertEquals(4, p.getY());
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPuntPositiuConstructor() {
    	Punt p = new Punt(2, -2);
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testPuntPositiuSet() {
    	Punt p = new Punt();
    	p.setX(-2);
    }
    
    @Test
    public void testSuma() {
    	// comprova que el mètode suma() funciona correctament.
    	Punt p = new Punt(3, 4);
    	Punt p2 = new Punt(1, 1);
    	p.suma(p2);
    	assertEquals(4, p.getX());
    	assertEquals(5, p.getY());
    }

    public static void main(String args[]) {
        org.junit.runner.JUnitCore.main("TestPunt");
    }
}