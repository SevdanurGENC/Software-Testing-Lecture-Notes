package main;


//Fizz Buzz Algoritmasinin Gereksinimleri
//1 ile 100 arasinda bir sayi al eger sayi 3'e tam bolunuyorsa string "Fizz" degerini dondur.
//1 ile 100 arasinda bir sayi al eger sayi 5'e tam bolunuyorsa string "Buzz" degerini dondur.
//1 ile 100 arasinda bir sayi al eger sayi 3 ve 5'e tam bolunuyorsa string "FizzBuzz” degerini dondur.
//1 ile 100 arasinda bir sayi al eger sayi 3 ve 5'e tam bolunmuyorsa string "Girilen sayi 3 ve 5’e tam bolunmuyor." degerini dondur.
//Eger girilen sayi 1 ile 100 arasinda degilse string "Girilen sayi 1 ile 100 arasinda olmalidir." degerini dondur.


public class FizzBuzz {
	
	public static String sayiKontrol(int x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "FizzBuzz";
        }
        if (x % 3 == 0) {
            return "Fizz";
        }
        if (x % 5 == 0) {
            return "Buzz";
        }
        if (x % 3 != 0 && x % 5 != 0) {
            return "Girilen sayi 3 ve 5'e tam bolunmuyor.";
        }
        if (x < 1 && x > 100) {
            return "Girilen sayi 1 ile 100 arasinda olmalidir.";
        }
        return null;
    }
	
	public static void main(String[] args) {
			System.out.println(sayiKontrol(3).toString());
	}
}
