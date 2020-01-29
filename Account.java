package sample.example.corejava;

abstract public class Account {
	public static void createAccount() {
		String name_Ac = "SBI";
		System.out.println("the Account Name is :" + name_Ac);
	}
	
	abstract public void withdrow();
	abstract public void deposit();

}
