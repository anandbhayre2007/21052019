package arrays;

public class Array1 {

	public static void main(String[] args) 
	{
		String name="Vinaya";
		//System.out.println(name);		
		String name2="Anand";
		
		String[] stds=new String[6];
		stds[0]="Swati";
		stds[1]="Vinaya";
		stds[2]="Kalyani";
		stds[3]="Suarajit";
		stds[4]="Arif";
		stds[5]="Ajasra";
		
		/*System.out.println(stds[0]);
		System.out.println(stds[1]);
		System.out.println(stds[2]);
		System.out.println(stds[3]);
		System.out.println(stds[4]);
		System.out.println(stds[5]);*/
		
		//for(int n=0;n<6; n++)
			//System.out.println(stds[n]);
		
		Swati s= new Swati("Anand");
		
	
		System.out.println(s.name);
		
		
	}

}
