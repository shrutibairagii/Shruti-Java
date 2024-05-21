class Fruit
{
	String shape;
	String taste;
	String texture;
	String nutritionalValue;

	Fruit(String shape,String taste, String texture,String nutritionalValue)
	{
		super();
		this.shape=shape;
		this.taste=taste;
		this.texture=texture;
		this.nutritionalValue=nutritionalValue;
	}
	public void displayFruit()
	{
		System.out.println("*****Fruit*****");
		System.out.println("Shape: "+shape);
		System.out.println("Taste: "+taste);
		System.out.println("Texture: "+texture);
		System.out.println("Nutritinal Value: "+nutritionalValue);

	}
}
class Apple extends Fruit
{
	String fruitName;

	Apple(String fruitName,String shape,String taste, String texture,String nutritionalValue)
	{
		super(shape,taste,texture,nutritionalValue);
		this.fruitName=fruitName;
	}
	public void displayApple()
	{
		System.out.println("*****APPLE*****");
		System.out.println("Fruit Name: "+this.fruitName);
	}
}
class SingleLevelInheEx3
{
	public static void main(String[] args) 
	{
		Apple obj= new Apple("Apple","Round","Sweet and Tart","Crispy and Juciy","Vitamin C");
		obj.displayFruit();
		obj.displayApple();	
	}
}