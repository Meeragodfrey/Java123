package hybridinheritance;

public class Daughter extends Father

{
	String dname="anu";
	public void display3()
	{
	System.out.println(dname);
	}
	public static void main(String args[])
	{
		Daughter obj=new Daughter();
		obj.display();
		obj.display1();
		//obj.display2();
		Son obj1= new Son();
		obj1.display2();
		obj.display3();
		}
}
