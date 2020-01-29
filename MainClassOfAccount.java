package sample.example.corejava;

public class MainClassOfAccount {

	public static void main(String[] args) {
		System.out.println("Savings Account class");
		SavingsClass savings = new SavingsClass();
		savings.createAccount();
		savings.deposit();
		savings.deposit();
		System.out.println();
		
		System.out.println("FD Account class");
		FDAccount fd = new FDAccount();
		fd.createAccount();
		fd.deposit();
		fd.withdrow();
		
		
	}

}
