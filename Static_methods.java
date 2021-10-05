package functional_interface;
interface Study
{
	public void work();
	static void Qualification()
	{
		System.out.println("B.Tech");
	}
	default void grade()
	{
		System.out.println("B.Tech 8.6 cgpa");
	}
	
}
interface Dance
{
	default void grade()
	{
		System.out.println("clasical 8.6 cgpa");
	}
	static void Qualification()
	{
		System.out.println("classical");
	}
	
}

class Meena implements Study,Dance
{
	public void work()
	{
		System.out.println("searching for work");
		
	}
	public void grade()
	{
		Dance.super.grade();
		
	}
}

public class Static_methods {
	public static void main(String args[])
	{
		Meena s=new Meena();
		s.work();
		s.grade();
		Dance.Qualification();
		Study.Qualification();
		
	}

}
