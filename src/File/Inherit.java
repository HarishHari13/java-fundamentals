package File;
class Simple{
	private int pri;
	int def;
	protected int pro;
	public int pub;
	Simple(){
		pri=10;
		def=20;
		pro=30;
		pub=40;
	}
}
class Inherit extends Simple{
Inherit(){
	def=200;
	pro=300;
	pub=400;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Inherit i = new Inherit();
System.out.println(i.def);
System.out.println(i.pro);
System.out.println(i.pub);

	}

}
