package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.denemeSinif;

public class denemeSinifTest {

	public denemeSinif testDenemesi;
	
	@Before  //T�m test kodlar�ndan �nce �al��s�n.
	public void setUp() {
		testDenemesi = new denemeSinif();  //nesne olu�turuyoruz.
	}
	
	@Test
	public void buyukSayiKontrol(){
		Assert.assertEquals("Toplama islemi", 17 , testDenemesi.deneme(10, 7));
	}
	
	@Test
	public void kucukSayiKontrol(){
		Assert.assertEquals("C�karma islemi",-5,testDenemesi.deneme(5, 10));
	}   
}