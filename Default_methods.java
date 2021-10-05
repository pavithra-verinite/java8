package functional_interface;

interface A
{
	public void act();
	default void run()
	{
		System.out.println("defult class in interface a");
	}
}
interface B
{
	public void action();
	default void run()
	{
		System.out.println("defult class in interface b");
	}
	
}

class Geek implements A,B
{
	public void act()
	{
		System.out.println("act");
	}
	public void action()
	{
		System.out.println("action");
	}
	public void run()
	{
		//A.super.run();
		B.super.run();
		A.super.run();
	}
	
}

public class Default_methods {
	public static void main(String args[])
	{
		Geek g=new Geek();
		g.act();
		g.action();
		g.run();
		
	}

}
