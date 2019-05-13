import org.junit.*;
import static org.junit.Assert.*;    // importa una classe static

public class TestSegment {
	
	@Test
	public void testLongitud() {
		// comprova que retorna bé la longitud
		Segment s = new Segment();
		assertEquals(2.8284271247461903, s.longitud(), 0);
	}
	
	public static void main(String[] args) {
		org.junit.runner.JUnitCore.main("TestSegment");

	}
}
