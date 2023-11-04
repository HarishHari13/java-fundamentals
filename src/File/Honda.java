package File;
abstract class Bike{
	abstract void run();
	void display() {
		System.out.println("non abstract method");
	}}
	
	public class Honda extends Bike{
		void run() {
			System.out.println("running safely");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike obj = new Honda();
obj.display();
obj.run();
	}

	}
