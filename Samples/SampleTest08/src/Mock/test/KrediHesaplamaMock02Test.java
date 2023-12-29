package Mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.mockito.MockitoAnnotations;
import org.junit.jupiter.api.BeforeEach;


import Mock.main.KrediHesaplama;
import Mock.main.HesaplamaKayit;

@RunWith(MockitoJUnitRunner.class)
class KrediHesaplamaMock02Test {

	@InjectMocks
	KrediHesaplama krediHesaplama;
	@Mock
	HesaplamaKayit HesaplamaKayit;
	
	@BeforeEach
	void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);    
	}
	
	@Test
	public void faizHesaplamaTest(){
		double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
		assertEquals(1.20, hesaplananFaiz, 0.001);
	}
 
}
