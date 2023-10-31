package bank;

public class Account {
	public static void main(String[] args) {
		System.out.println("SAVINGS ACCOUNT DETAILS");
		SavingsAccount sac=new SavingsAccount(1001,"Ann Kamau", "0720000000","test@gmail.com",1000);
		sac.accountholder();
		sac.deposit(500);
		sac.displayBalance();
	}
}
