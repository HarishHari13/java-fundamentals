package File;
abstract class Bank1{
	abstract int getRateOfinterest();
	}
class SBI extends Bank1{
	int getRateOfinterest() {
		return 7;
	}
}
class PNB extends Bank1{
	int getRateOfinterest() {
		return 8;
	}
}

public class Bank_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank1 b;
b = new SBI();
System.out.println("rate of interest is: "+b.getRateOfinterest()+"%");
b=new PNB();
System.out.println("rate of interest is: "+b.getRateOfinterest()+"%");

	}

}
