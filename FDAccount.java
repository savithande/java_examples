package sample.example.corejava;

public class FDAccount extends Account{

	@Override
	public void withdrow() {
		System.out.println("withdrow of FD class");
	}

	@Override
	public void deposit() {
		System.out.println("deposite of FD class");		
	}

}
