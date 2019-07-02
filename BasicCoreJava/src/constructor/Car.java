package constructor;

public class Car 
{
	
	String name;
	String colour;
	String model;
	static int wheels=4;
	int maxSpeed;
	
	public Car(String name, String colour, String model, int maxSpeed)
	{
		this.name=name;
		this.colour=colour;
		this.model=model;
		this.maxSpeed=maxSpeed;
	}
	
	public Car(String name,  String model)
	{
		this.name=name;
		this.model=model;
	}
	
	public void driving()
	{
		System.out.println("I can drive my "+colour+" colour "+name+" "+model+" model at maximum speed of "+maxSpeed+" kmph");
	}
	
	public void brake()
	{
		System.out.println("Braking function is working on "+wheels+" wheels in my  "+name+" "+model);
	}

}
