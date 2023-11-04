package File;
class ClassFirst{
	public void display() {
		System.out.println("class first: display");
	}
	public void show() {
		System.out.println("class first: show");
	}
}
class ClassSecond extends ClassFirst{
	public void display() {
		System.out.println("class second: display");
	}
	public void show() {
		System.out.println("class second: show");
	}
}
public class UseFirstSecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ClassSecond cs = new ClassSecond();
cs.display();
cs.show();
	}

}
