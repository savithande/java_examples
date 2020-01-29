package sample.example.corejava;

public class MainClassOne {
	public static void main(String[] args) {
		SubClassOne ref1 = new SubClassOne();
		SubClassOne ref2 = ref1;//upcasting
		
		System.out.println(ref1.a);
		ref1.count();
		
		SubClassOne ref3 = (SubClassOne) ref2; //downcasting
		
		SubClassOne ref4 = ref3;
		ref4.count();
		ref4.display();
		System.out.println();
		System.out.println(ref3.a);
		System.out.println(ref3.b);
		ref3.count();
		ref3.display();
	}

}
