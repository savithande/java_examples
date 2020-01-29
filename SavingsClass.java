package sample.example.corejava;

public class SavingsClass extends Account {
 

	@Override
	public void deposit() {
		System.out.println("deposite of savings account");
	}

	@Override
	public void withdrow() {
		System.out.println("withdrow of savings account");
	}

}
