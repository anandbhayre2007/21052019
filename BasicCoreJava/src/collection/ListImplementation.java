package collection;

import java.util.ArrayList;

public class ListImplementation {

	public static void main(String[] args) 
	{
		ArrayList<String> list= new ArrayList<>();		
		list.add("Anand");
		list.add("Bhayre");
		list.add("Techbodhi");
		
		for(String s: list)
		{
			System.out.println(s);
		}
		
		for(int i=0; i<list.size(); i++)
		{
			System.out.println(list.get(i));
		}

	}

}
