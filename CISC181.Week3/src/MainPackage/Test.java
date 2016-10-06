package MainPackage;

public class Test {

	public static void main(String[] args) {
		Account newAccount = new Account(1122, 20000);
		newAccount.setAnnualInterestRate(0.045);
		newAccount.withdraw(2500);
		newAccount.deposits(3000);
		System.out.println("The balance of this account are " + newAccount.getBalance());
		System.out.println("The monthly interest rate is " + newAccount.getMonthlyInterestRate());
		System.out.println("The date of this account created is " + newAccount.getDataCreated());

	}

}
