package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;
import main.denemeSinif;

public class denemeSinifTest {

	public denemeSinif testDenemesi;
	
	@Before  //Tüm test kodlarýndan önce çalýþsýn.
	public void setUp() {
		testDenemesi = new denemeSinif();  //nesne oluþturuyoruz.
	}
	
	@Test
	public void buyukSayiKontrol(){
		Assert.assertEquals("Toplama islemi", 17 , testDenemesi.deneme(10, 7));
	}
	
	@Test
	public void kucukSayiKontrol(){
		Assert.assertEquals("Cýkarma islemi",-5,testDenemesi.deneme(5, 10));
	}   
}