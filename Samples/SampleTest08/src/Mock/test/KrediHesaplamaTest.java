package Mock.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Mock.main.KrediHesaplama;

class KrediHesaplamaTest {
//olmasi gerek test sinifiydi ama nullpointerexception hatasi veriyor
	KrediHesaplama krediHesaplama = new KrediHesaplama();
	
	@Test
	public void faizHesaplamaTest(){
		double hesaplananFaiz = krediHesaplama.faizHesapla(100.0, 1.20);
		assertEquals(1.20, hesaplananFaiz, 0.001);
	}


}
