package collection;

import java.util.Vector;

public class LinkedListClass {

	public static void main(String[] args) 
	{
		Vector<String> list= new Vector<>();		
		list.add("Anand");
		list.add("Bhayre");
		list.add("Techbodhi");
		
		for(String s:list)
		{
			System.out.println(s);
		}
	}

}
