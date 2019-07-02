package arrays;

public class TwoDimensionalArray {

	public static void main(String[] args) 
	{
		String[][] arr= new String[3][2];
		
		//Row 1
		arr[0][0]="Name";
		arr[0][1]="Surname";
		
		//Row 2
		arr[1][0]="Name1";
		arr[1][1]="Surname1";				
				
		//Row 3
		arr[2][0]="Name2";
		arr[2][1]="Surname2";

		for(int r=0; r<=2; r++)
		{
			for(int c=0; c<=1; c++)
			{
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
		
	}

}
