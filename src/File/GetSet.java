package File;
class Person1{
	private String name;
	private int age;
	private String country;
	public String getName(){
		return name;
		}
	public void setName(String name) {
		this.name=name;
	}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
	}
		public String getCountry() {
			return country;
		}
public void setCountry(String country) {
	this.country=country;
}
}
public class GetSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person1 obj = new Person1();
		obj.setName("Hari");
		obj.setAge(21);
		obj.setCountry("India");
		System.out.println("name:"+obj.getName());
		System.out.println("age:"+obj.getAge());
		System.out.println("country:"+obj.getCountry());
		
		

	}

}
