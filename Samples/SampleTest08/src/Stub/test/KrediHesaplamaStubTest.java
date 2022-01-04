package Stub.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Stub.main.HesaplamaKayit;
import Stub.main.KrediHesaplama;

class KrediHesaplamaStubTest {

	KrediHesaplama krediHesaplama = new KrediHesaplama();
	
	@Test
	public void faizHesaplamaTest(){
		//stub icin bilgmedigimiz bir sinifa nesne olusturuyoruz.
		krediHesaplama.hesaplamaKayit = new HesaplamaKayit();
		double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
		assertEquals(1.20, hesaplananFaiz, 0.001);
	} 

}
