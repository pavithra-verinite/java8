package functional_interface;
import java.util.function.Predicate;
import java.util.*;


public class Lamda {
	public static void main(String args[])
	{
		Predicate<Integer> p=(n)->(n>0);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer");
		int n=sc.nextInt();
		System.out.println(p.test(n));
		
	}

}

