package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import main.HarfBulmaca;

class HarfBulmacaTest {

	 @Test
	    public void testSesliHarfler() {
	        HarfBulmaca ltrFnd = new HarfBulmaca();
	        int donenSesli = ltrFnd.kacSesli("www.kilicmehmet.com");

	        Assert.assertEquals(5, donenSesli); 
	    }

	    @Test
	    public void testSessizHarfler() {
	        HarfBulmaca ltrFnd = new HarfBulmaca();
	        int donenSessiz = ltrFnd.kacSessiz("www.kilicmehmet.com");
	        Assert.assertEquals(14, donenSessiz);

	    }

}
