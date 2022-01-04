package Mock.test;

import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mockito;
import org.junit.jupiter.api.Test;

import Mock.main.HesaplamaKayit;
import Mock.main.KrediHesaplama;

class KrediHesaplamaMock01Test {

	KrediHesaplama krediHesaplama = new KrediHesaplama();
	
	@Test
	public void faizHesaplamaTest(){
		krediHesaplama.hesaplamaKayit = Mockito.mock(HesaplamaKayit.class);
		double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
		assertEquals(1.20, hesaplananFaiz, 0.001);
	}


}
