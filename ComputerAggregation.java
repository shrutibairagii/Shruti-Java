class Computer
{
	String brand;
	double price;
	String model;
	Cpu cpu;
	Monitor monitor;
	Keyboard keyboard;
	Mouse mouse;
	Printer printer;
	Speakers speakers;

	Computer(String brand, double price,String model)
	{
		this.brand=brand;
		this.price=price;
		this.model=model;
		this.keyboard=new Keyboard("Logitech",104,"yes","Membrane",4000);
		this.mouse=new Mouse("Logitech MX Master 3","Wireless laser mouse","Yes",9000);
		this.printer=new Printer("Epson","Epson Eco Tank L3150","Ink tank color printer","High use", 14000);
		this.speakers=new Speakers("Logitech","2.1 stereo ",3,9000);
	}	
	public void displayComputer()
	{
		System.out.println();
		System.out.println("******COMPUTER DETAILS******");
		System.out.println("Computer Brand: "+this.brand);
		System.out.println("Computer Price: "+this.price);
		System.out.println("Computer Model: "+this.model);		
	}
	public void createInstanceOfCpu(String ram , String rom,String processor)
	{
		cpu=new Cpu(ram,rom,processor);
	}
	public void createInstanceOfMonitor(String displayType,double size,String resolution)
	{
		monitor =new Monitor(displayType,size, resolution);
	}
}
class Cpu
{
	String ram;
	String rom;
	String processor;

	Cpu(String ram , String rom,String processor)
	{
		this.ram=ram;
		this.rom=rom;
		this.processor=processor;
	}
	void displayCpu()
	{
		System.out.println();
		System.out.println("******CPU DETAILS******");
		System.out.println("RAM: "+this.ram);
		System.out.println("ROM: "+this.rom);
		System.out.println("Processor: "+this.processor);
	}
}
class Monitor
{
	String displayType;
	double size;
	String resolution;
	

	Monitor(String displayType,double size,String resolution)
	{
		this.displayType=displayType;
		this.size=size;
		this.resolution=resolution;
		
	}
	 void displayMonitor()
	{
		System.out.println();
		System.out.println("******MONITOR DETAILS******");
		System.out.println("Monitor display type: "+this.displayType);
		System.out.println("Monitor size: "+this.size+" inches");
		System.out.println("Monitor resolution: "+this.resolution);
		
	}
}
class Keyboard
{
	String brand;
	int noOfKeys;
	String backLight;
	String type;
	double price;

	Keyboard(String brand,int noOfKeys,String backLight,String type,double price)
	{
		this.brand=brand;
		this.noOfKeys=noOfKeys;
		this.backLight=backLight;
		this.type=type;
		this.price=price;
	}
	 void displayKeyboard()
	{
		System.out.println();
		System.out.println("******KEYBOARD DETAILS******");
		System.out.println("Keyborad brand: "+this.brand);
		System.out.println("Number of Keys: "+this.noOfKeys);
		System.out.println("Keyborad have back light or not: "+this.backLight);
		System.out.println("Keyboard type: "+this.type);
		System.out.println("Keyborad price: "+this.price);
	}
}
class Mouse
{
	String brand;
	String type;
	String scroll;
	double price;

	Mouse(String brand,String type,String scroll,double price)
	{
		this.brand=brand;
		this.type=type;
		this.scroll=scroll;
		this.price=price;
	}
	 void displayMouse()
	{
		System.out.println();
		System.out.println("******MOUSE DETAILS******");
		System.out.println("Mouse brand: "+this.brand);
		System.out.println("Mouse type: "+this.type);
		System.out.println("Mouse have scroll function: "+this.scroll);
		System.out.println("Mouse price: "+this.price);
	}
}
class Printer
{
	String brand;
	String model;
	String type;
	String capacity;
	double price;

	Printer(String brand,String model,String type,String capacity,double price)
	{
		this.brand=brand;
		this.model=model;
		this.type=type;
		this.capacity=capacity;
		this.price=price;
	}
	 void displayPrinter()
	{
		System.out.println();
		System.out.println("******PRINTER DETAILS******");
		System.out.println("Printer brand: "+this.brand);
		System.out.println("Printer model: "+this.model);
		System.out.println("Printer type: "+this.type);
		System.out.println("Printer capacity: "+this.capacity);
		System.out.println("Printer price: "+this.price);
	}
}
class Speakers
{
	String brand;
	String type;
	int noOfSpeakers;
	double price;

	Speakers(String brand,String type,int noOfSpeakers,double price)
	{
		this.brand=brand;
		this.type=type;
		this.noOfSpeakers=noOfSpeakers;
		this.price=price;
	}
	 void displaySpeakers()
	{
		System.out.println();
		System.out.println("******SPRAKERS DETAILS******");
		System.out.println("Speakers brand: "+this.brand);
		System.out.println("Speakers type: "+this.type);
		System.out.println("No of Speakers: "+this.noOfSpeakers);
		System.out.println("Speakers price: "+this.price);
	}
}
class ComputerAggregation
{
	public static void main(String[] args) 
	{
		Computer obj=new Computer("Dell",150000,"Dell XPS 15");
		obj.displayComputer();
		obj.createInstanceOfCpu("8GB","4MB","CORE i5");	
		obj.cpu.displayCpu();
		obj.createInstanceOfMonitor("IPS Panael",15.6,"4K UHD(3840*2400)");
		obj.monitor.displayMonitor();
		obj.keyboard.displayKeyboard();
		obj.mouse.displayMouse();
		obj.printer.displayPrinter();
		obj.speakers.displaySpeakers();
	}
}