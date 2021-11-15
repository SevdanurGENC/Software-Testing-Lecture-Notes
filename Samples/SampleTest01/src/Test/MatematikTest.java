package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test; 
import DortIslem.Matematik;

class MatematikTest {
 
	
	@Test
	public void testToplamaIslemi()     {
	Matematik dortIslem = new Matematik();
	assertEquals("Sonuc : ", 15, dortIslem.ToplamaIslemi(10, 5));
	}

}
