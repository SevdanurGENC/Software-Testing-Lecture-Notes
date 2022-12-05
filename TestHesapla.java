package test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import main.Hesapla;

public class TestHesapla {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	
	
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	
	
	}

	@Before 	// Test metotlarindan ONCE
	public void setUp() throws Exception {
		System.out.println("Test islemi baslatiliyor");  
	}

	@After    // Test metotlarindan SONRA
	public void tearDown() throws Exception {
		System.out.println("Test islemi sona ermistir"); 
	}

	@Test
	public void test01() {
		fail("Not yet implemented");
	}

	@Test
	public void test02() {
		fail("Not yet implemented");
	}
	
	@Test
	public void test03() {
		fail("Not yet implemented");
	}
	 
	public static double hsp Hesapla;
	
	public TestHesapla(){
		hsp = new Hesapla();
	}
	
	@Test
	public void testtopla(){ 
		double sonuc =  hsp.topla(80, 39); 
		Assert.assertEquals(119.0, sonuc);
	}
	
	
}
