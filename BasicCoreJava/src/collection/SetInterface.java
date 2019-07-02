package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetInterface {

	public static void main(String[] args)
	{
		Set<String> set1=new HashSet<>();
		set1.add("Anand");
		set1.add("Techbodhi");
		set1.add("Bhayre");
		set1.add("Anand");		
		for(String s:set1)
		{
			System.out.println(s);
		}		
		System.out.println("***************************************");
		
		set1=new LinkedHashSet<>();
		set1.add("Anand");
		set1.add("Techbodhi");
		set1.add("Bhayre");
		set1.add("Anand");		
		for(String s:set1)
		{
			System.out.println(s);
		}		
		System.out.println("***************************************");
		
		set1=new TreeSet<>();
		set1.add("Anand");
		set1.add("Techbodhi");
		set1.add("Bhayre");
		set1.add("Anand");		
		for(String s:set1)
		{
			System.out.println(s);
		}		
		System.out.println("***************************************");
		

	}

}
