package hierarchial;

public class Developer extends Employee 
{
	int b=10;
	public void display2()
	{
		System.out.println(b);
	}
	public static void main(String args[])
	{
		Developer obj=new Developer();
		Tester obj1=new Tester();
		obj.display();
		obj.display2();
		obj1.display1();
		
	}

}
