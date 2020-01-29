package sample.example.corejava;

public class MainClassTwo {

	public static void main(String[] args) {
		ParentClass parentclass = new ParentClass();
		ChildClass childclass = new ChildClass();
		parentclass.function();
//		childclass.parents();
		
		ParentClass obj = new ChildClass();
		obj.function();
	}

}
