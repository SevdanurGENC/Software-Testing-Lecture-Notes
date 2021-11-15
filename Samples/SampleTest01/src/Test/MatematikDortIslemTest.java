package Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import DortIslem.MatematikDortIslem;

class MatematikDortIslemTest {

	@Test
	public void testToplamaIslemi()     {
		MatematikDortIslem dortIslem = new MatematikDortIslem();
		assertEquals("Sonuc : ", 15, dortIslem.ToplamaIslemi(10, 5));
	}

	@Test
	public void testCikarmaaIslemi()     {
		MatematikDortIslem dortIslem = new MatematikDortIslem();
		assertEquals("Sonuc : ", 5, dortIslem.CikarmaaIslemi(10, 5));
	}

	@Test
	public void testCarpmaIslemi()     {
		MatematikDortIslem dortIslem = new MatematikDortIslem();
		assertEquals("Sonuc :", 10, dortIslem.CarpmaIslemi(10, 5));
	}

	@Test
	public void testBolmeIslemi()     {
		MatematikDortIslem dortIslem = new MatematikDortIslem();
		assertEquals("Sonuc : ", 2, dortIslem.BolmeIslemi(10, 5));
	}

}
