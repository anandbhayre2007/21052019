package stringclass;

public class Testing {

	public static void main(String[] args)
	{
		
		String name="SurAjeEt";
		String name2="Anand";
		int a=10;
		int b=20;
		String a1="";
		
		
		
		//1. CharAt
		System.out.println(name.charAt(0));
		
		//2. Equals
		if(name.equals(name2))
		{
			System.out.println("name1 and name2 are same");
		}else {
			System.out.println("name1 and name2 are not same");
		}
		
		//3. EqualIgnoreCase
		if(name.equalsIgnoreCase(name2))
		{
			System.out.println("name1 and name2 are same");
		}else {
			System.out.println("name1 and name2 are not same");
		}
		
		//4. Length
		System.out.println(name.length());
		
		//5. Replace
		System.out.println(name.replace("an", "na"));
		
		//6. Split
		String[] arr=name.split("e");
		System.out.println(arr.length);

		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		/*for(String s : arr)
		{
			System.out.println(s);
		}*/
		
		//substring
		System.out.println(name.substring(3));
		System.out.println(name.substring(3, 7));
		
		//
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		
		
		
		

	}

}
