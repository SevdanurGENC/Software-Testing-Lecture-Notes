package test;

import static org.junit.jupiter.api.Assertions.*; 
import org.junit.jupiter.api.Test;  
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass; 

import main.Sample;

class SampleTest {

	public static Sample testClass; 
	
	public SampleTest() {
		testClass = new main.Sample();
	}

	@BeforeClass
	public static void setUpClass() throws Exception {
		System.out.println("BeforeClass");
	}

	@AfterClass
	public static void tearDownClass() throws Exception {
		System.out.println("AfterClass"); 
	}

	@Before
	public void setUp() {
		System.out.println("Before");
	}

	@After
	public void tearDown() {
		System.out.println("After");
	}

	@Test
	public void testRandomIntValue() {
		assertEquals(1, testClass.randomIntValue());
	}

	@Test
	public void testNewString() {
		assertNotNull(testClass.newString());
		assertEquals(new String(), testClass.newString());
	}

}
