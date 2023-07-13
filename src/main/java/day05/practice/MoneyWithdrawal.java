package day05.practice;

public class MoneyWithdrawal {

	public static void main(String[] args) {

		ATM icciATM = new IciciATM();
		
		Account icciAccount = new Account();
		icciAccount.setAccNo("1234567890123456");
		icciAccount.setBalance(20000);

		System.out.println("Icici Bank");

		try {

			icciATM.deposit(icciAccount, 1000);

			icciATM.withdraw(icciAccount, 2000);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

		ATM axisATM = new AxisATM();
		
		Account axisAccount = new Account();
		axisAccount.setAccNo("1234567890123456");
		axisAccount.setBalance(1000);

		System.out.println("Axis Bank");

		try {

			axisATM.deposit(axisAccount, 1000);
			axisATM.withdraw(axisAccount, 2000);

		} catch (Exception e) {

			System.out.println(e.getMessage());
		}

	}

}
