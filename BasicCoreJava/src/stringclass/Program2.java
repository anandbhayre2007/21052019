package stringclass;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name="anand";
		int count=0;
		/*char c1='a';
		int count=0;
		for(int i=0;i<name.length(); i++)
		{
		if(c1==name.charAt(i))
		{
			count++;
		}
		}
		
		System.out.println(count);*/
		
		//Method 2
		/*String c1="a";
		
		for(int i=0; i<name.length(); i++)
		{
			if(c1.equals(name.substring(i, i+1)))
			{
				count++;
			}
		}
		System.out.println(count);*/
		
		//Method 3
		System.out.println(name.length()-name.replace("a", "").length());

	}

}
