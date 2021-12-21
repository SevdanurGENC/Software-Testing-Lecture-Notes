package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.HarfBulmaca;

class HarfBulmacaTest {

		@Test
	    public void testSesliHarfler() {
	        HarfBulmaca sesliBul = new HarfBulmaca();
	        int donenSesli = sesliBul.kacSesli("www.sevdanurgenc.com");

	        Assert.assertEquals(5, donenSesli); 
	    }

	    @Test
	    public void testSessizHarfler() {
	        HarfBulmaca sesliBul = new HarfBulmaca();
	        int donenSessiz = sesliBul.kacSessiz("www.sevdanurgenc.com");
	        Assert.assertEquals(15, donenSessiz);

	    }

}
