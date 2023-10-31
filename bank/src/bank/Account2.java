package bank;

public class Account2 {
	public static void main(String[] args) {
		System.out.println("CURRENT ACCOUNT DETAILS");
		CurrentAccount cur=new CurrentAccount(1001,"Peter Smith", "08100000","admin@gmail.com",0);
		cur.accountholder();
		cur.deposit(300);
		cur.displayBalance();
	}
}
