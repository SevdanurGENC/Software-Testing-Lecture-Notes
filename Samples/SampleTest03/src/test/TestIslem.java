package test;

import static org.junit.jupiter.api.Assertions.*;
 
import org.junit.jupiter.api.Test;

import junit.framework.Assert;
import junit.framework.TestCase;
import main.Hesapla;

import org.junit.Before; 

public class TestIslem extends TestCase {

	@Before
	public void setUp() throws Exception {
		System.out.println("Test metodu cagirilacak");
		super.setUp();
	}

	@Override
	protected void tearDown() throws Exception {
		System.out.println("Test metodu calisti bitti");
		super.tearDown();
	}

	@Test
	public void testTopla() {
		double sonuc = new Hesapla().topla(25, 2);
		Assert.assertEquals(27.0, sonuc);
	}

	@Test
	public void testCikar() {
		double sonuc = new Hesapla().cikar(25, 2);
		Assert.assertEquals(23.0, sonuc);
	}

	@Test
	public void testCarp() {
		double sonuc = new Hesapla().carp(25, 2);
		Assert.assertEquals(50.0, sonuc);
	}

	@Test
	public void testBol() {
		double sonuc = new Hesapla().bol(25, 2);
		Assert.assertEquals(12.6, sonuc);
	}
}