package main;

import java.util.Random;

public class Sample {

	public static int randomIntValue() {
		Random r = new Random();
		return r.nextInt(3);
	}

	public static String newString() {
		return new String();
	}

	public static void main(String[] args) { 

		System.out.println("Int Value : " + randomIntValue());
		System.out.println("String Value : " + newString());
	}

}
