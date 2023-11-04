package File;
interface Inter1{
	public void fun1();
}
interface Inter2 extends Inter1{
	public void fun2();
}
class InterImple implements Inter1,Inter2{
	public void fun1() {
		System.out.println("Interface1");
	}
	public void fun2() {
		System.out.println("interface2");
	}
}

public class mainClassForInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
InterImple obj = new InterImple();
Inter2 obj2 = obj;
obj2.fun1();
obj2.fun2();
	}

}
