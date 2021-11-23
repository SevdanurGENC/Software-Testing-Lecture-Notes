package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class FizzBuzzTest {

	 //Her methoda sinif ornegini olusturmak icin field tanimlandi.
    private FizzBuzz fizzBuzz;

    // Her test methoduna girmeden once setUp methoduna girecek ve 
    //sinifin ornegini olusturacak.
    @Before
    public void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void sayininUceBolunmeDurumu() {

        Assert.assertEquals("Fizz", fizzBuzz.sayiKontrol(3));
    }

    @Test
    public void sayininBeseBolunmeDurumu() {
        Assert.assertEquals("Buzz", fizzBuzz.sayiKontrol(5));
    }

    @Test
    public void hemUceHemBeseBolunmeDurumu() {
        Assert.assertEquals("FizzBuzz", fizzBuzz.sayiKontrol(30));
    }

    @Test
    public void sayiUceVeBeseBolunmemeDurumu() {
        Assert.assertEquals("Girilen sayı 3 ve 5'e tam bolunmuyor.", fizzBuzz.sayiKontrol(7));
    }

    @Test
    public void birIleYuzArasindaOlmamaDurumu() {
        Assert.assertEquals("Girilen sayi 3 ve 5'e tam bolunmuyor.", fizzBuzz.sayiKontrol(101));
    }

    //Test methodu calismasini bitirdikten sonra 
    //tearDown methoduna girecek ve ilgili sinifi null olarak set edecek.
    @After
    public void tearDown() {
        fizzBuzz = null;
    }
}
