package answers;

class Account{
	String customer_name, account_no;
	
	void display() {
		System.out.println("Name: "+this.customer_name+"\nAccount Number: "+this.account_no);
	}
}

class Saving_Account extends Account{
	double min_balance, saving_bal;
	
	void display() {
		super.display();
		System.out.println("Min_Balance: "+this.min_balance+" \nSaving Balance: "+this.saving_bal);
	}
}

class Account_Details extends Saving_Account{
	double deposits, withdrawals;
	
	void display() {
		super.display();
		System.out.println("Deposits: "+this.deposits+" \nWithdrawals: "+this.withdrawals);
	}
}
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account_Details account1 = new Account_Details();
		account1.customer_name = "Mensah Ofosu George";
		account1.account_no = "123243598";
		account1.deposits = 3456.234;
		account1.min_balance = 34.5;
		account1.withdrawals = 12223.54;
		account1.display();

	}

}
