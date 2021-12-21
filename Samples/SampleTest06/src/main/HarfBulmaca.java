package main;

public class HarfBulmaca {
	
	 public int kacSesli(String kelime) {
	        String sesliler = "aeoöuüiAEOÖUÜIı";
	        int toplam = 0;
	        for (int i = 0; i<kelime.length(); i++) {
	            if (sesliler.indexOf(kelime.charAt(i)) != -1) {
	                toplam++;
	            }
	        }
	        return toplam;
	    }

	    public int kacSessiz(String kelime) {
	        return kelime.length() - kacSesli(kelime);
	    }
}
