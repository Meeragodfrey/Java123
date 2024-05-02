package oops;

public class Bike extends Vehicle {

	int num=10;

public void display1()
{
	System.out.println("Register number:"+num);
}
public static void main(String args[])
{
	Bike obj= new Bike();
	obj.display();
	obj.display1();
}
}