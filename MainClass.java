package sample.example.corejava;

public class MainClass {

	public static void main(String[] args) {
//		 SubClass subclass = new SubClass();
//		Apple apple = new Apple();
//		apple.isFriut("Apple");
		
		Human human1 = new Human();
		human1.isHuman();
		
		Fruits fruits = human1;//upcasting
		fruits.isFriut("apple");
		
		
//		Apple apple = (Apple) human1;//narrowing
		
		Man man = new Man();
		man.isHuman();
		
		Human h1 = man;
		h1.isHuman();
		
//		Human human = new Man();
//		human.isHuman();
	}

}
