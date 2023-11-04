package File;
abstract class Shape{
	abstract void draw();
}
class Rectangle extends Shape{
	void draw() {
		System.out.println("drawing rectangle");
		}
}
class Circle extends Shape{
	void draw() {
		System.out.println("drawing circle");
	}
}
public class Test_abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Shape s = new Circle();
Shape r = new Rectangle();
s.draw();
r.draw();
	}

}
