package Stub.main;

public class KrediHesaplama {
	public HesaplamaKayit hesaplamaKayit;
	
	public double faizHesapla(double anaPara, double oran){
		if(oran < 1.0 ){
			oran = 1.0;
		}
		hesaplamaKayit.hesaplamayiKaydet(anaPara, oran); 
		return anaPara/100*oran;
	}

}
