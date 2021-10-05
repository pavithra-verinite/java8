package functional_interface;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;
public class Pre_defined_functional_interfaces {
	public static void main(String args[])
	{
		Consumer r=(l)->{System.out.println(l);};
		r.accept("consumer interface just acept the object or value ");
		Predicate<Integer> p=(n)->(n>0);
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer to check positive or not");
		int n=sc.nextInt();
		System.out.println("predicate interface return boolean value based on condition(positive or negative) : "+p.test(n));
		Function <Integer,Boolean> f=(n1)->n1%2==0;
		System.out.println("enter integer to check positive or not");
		int n1=sc.nextInt();
		System.out.println("function interface checking even or odd "+f.apply(n1));
	}

}

