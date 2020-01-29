package sample.example.corejava;

public class CastingExample {
	
	public static void main(String[] args) {
		int a = 10 ;
		double b = a; //windening
		System.out.println(b);
		
		int c = (int) b; //narrowing
		System.out.println(c);
		
		int x = 10;
		char y = (char) x;//narrowing
		System.out.println(y);
		
		int z = y;
		System.out.println(z);
	}

}
