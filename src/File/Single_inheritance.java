package File;
class Person{
	String name;
	int age;
	void getPerInfo(String str,int ag) {
		name=str;
		age=ag;
		
	}
	void putPerInfo() {
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
	}
}
class Student extends Person{
	int total;
	char grade;
	void getStuInfo(String n,int ag,int tot,char gr) {
		getPerInfo(n,ag);
		total=tot;
		grade=gr;
	}
	void putStuInfo() {
		putPerInfo();
		System.out.println("Total:"+total);
		System.out.println("Grade:"+grade);
	}
}

public class Single_inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student();
		s.getStuInfo("Honey",22,98,'A');
		s.putStuInfo();
	}

}
