class CarDriverComposition
{
	String brand;
	String model;
	String type;
	double price;
	int seatingCapacity;
	Engine engine;//2nd way, 3rd way

	
	//Engine engin = new Engine(120,1.2,"petrol",12,4);//1st way



	CarDriverComposition(String brand, String model, String type, double price, int seatingCapacity)
	// CarDriverComposition(String brand, String model, String type,double price,int seatingCapacity)//3rd way
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.price=price;
		this.seatingCapacity=seatingCapacity;
		//this.engine=engine;//3rd way
		this.engine=new Engine(120,1.2,"petrol",16,4);//4th way

		//engine = new Engine(120,1.2,"petrol",16,4); //2nd way
	
	}
	public void displayCar()
	{
		System.out.println("*****CAR DETAILS*****");
		System.out.println("Brand : "+brand);
		System.out.println("Model : "+model);
		System.out.println("Type : "+type);
		System.out.println("Price : "+price);
		System.out.println("Seating Capacity : "+seatingCapacity);
	}

}

class Engine
{
	double horsePower;
	double capacity;
	String engineType;
	double milage;
	int noOfPiston;

	Engine(double horsePower, double capacity, String engineType, double milage,int noOfPiston)
	{
		this.horsePower=horsePower;
		this.capacity=capacity;
		this.engineType=engineType;
		this.milage=milage;
		this.noOfPiston=noOfPiston;
	}
	public void diplayEngine()
	{
		System.out.println("*****Engine Details******");
		System.out.println("Horse Power: "+horsePower);
		System.out.println("Capacity : "+capacity);
		System.out.println("Engine Type: "+engineType);
		System.out.println("Milage: "+milage);
		System.out.println("No Of Pistones: "+noOfPiston);
	}
}
class CarDriver
{
	public static void main(String[] args) 
	{
		CarDriverComposition obj = new CarDriverComposition("tata","nexon","xuv",90000,5);
		//CarDriverComposition obj = new CarDriverComposition("tata","nexon","suv",900000,5(new Engine(120,1.2,"petrol",16,4)));//3rd way
		obj.displayCar();
		obj.engine.diplayEngine();
	}
}
