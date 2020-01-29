package sample.example.corejava;

public class MainClassOfAbstractClass {

	public static void main(String[] args) {
		ImplementationClassOfAbstractClass obj = new ImplementationClassOfAbstractClass();
		obj.college();
		System.out.println("name of the student : " +obj.name);
		
		obj.studentDetails();
		obj.studeyDetails();
	}

}
