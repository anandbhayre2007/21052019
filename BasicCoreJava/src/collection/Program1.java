package collection;

import java.util.ArrayList;

public class Program1 {

	public static void main(String[] args) 
	{
		ArrayList list= new ArrayList<>();
		
		list.add("Anand");
		list.add(30);
		list.add(true);

		for(Object o:list)
		{
			System.out.println(o);
		}
		
		
		
		

	}

}
