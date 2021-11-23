package main;

public class denemeSinif {

	public static int deneme(int x, int y){
		int sonuc = 0;
		if (x>y)
			sonuc = x+y;
		if (x<y)
			sonuc = x-y;
		return sonuc;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(deneme(10, 5));
	}

}
