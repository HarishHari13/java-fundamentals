package File;
class Bank{
	int account_no=1305;
	String name="Ravi";
	float amount=3000;
}
public class Bank_inheritance extends Bank{
	void deposit(int amount) {
		this.amount+=amount;
	}void withdraw(int amount){
		this.amount-=amount;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank_inheritance si = new Bank_inheritance();
si.deposit(1000);
System.out.println("Account number:"+si.account_no);
System.out.println("Name:"+si.name);
System.out.println("Amount:"+si.amount);
	}

}
