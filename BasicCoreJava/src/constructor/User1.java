package constructor;

public class User1 {

	public static void main(String[] args) 
	{
		Car car1= new Car("Audi","Red","A4", 160);		
		car1.brake();
		car1.driving();
		
		
		Car car2= new Car("VW","Black","Polo",150);
		car2.name="Maruti";
		car2.brake();
		car2.driving();
		
		Car car3= new Car("BMW","Black");
		car3.brake();
		
		

	}

}
