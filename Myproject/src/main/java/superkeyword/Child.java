package superkeyword;

public class Child extends Parent 
{
	String pname="anju";
	public void display()
	{
		System.out.println("Child name"+pname);
		super.display();
	}
	public Child()
	{
		super();
		int age=45;
		System.out.println("Child age" +age);
	}
	public static void main(String args[])
	{
		Child obj= new Child();//will call constructor first call the parent constructor and then child constructor
		obj.display();				
	}
	

}
