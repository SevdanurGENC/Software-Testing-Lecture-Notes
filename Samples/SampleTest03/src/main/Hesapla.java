package main;

public class Hesapla {
	
	public static double topla(int sayi1, int sayi2) {
		return sayi1 + sayi2;
	}

	public static double cikar(int sayi1, int sayi2) {
		return sayi1 - sayi2;
	}

	public static double carp(int sayi1, int sayi2) {
		return sayi1 * sayi2;
	}

	public static double bol(int sayi1, int sayi2) {
		return sayi1 / (double) sayi2;
	}
	
	public static void main(String[] args) {

		System.out.println(topla(7,77));

	}

}
