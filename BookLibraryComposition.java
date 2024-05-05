class BookLibraryComposition
{
	String name;
	String address;
	double hours;
	double fee;
	Book book;


	BookLibraryComposition(String name,String address,double hours,double fee)
	{
		this.name=name;
		this.address=address;
		this.hours=hours;
		this.fee=fee;
		this.book=new Book("Mrutunjay","Shivaji Sawant",1000);
	}
	public void displayLibrary()
	{
		System.out.println("******LIBRARY DETAILS******");
		System.out.println("Library Name: "+name);
		System.out.println("Libraby Address: "+address);
		System.out.println("Library Open Hours: "+hours+"hr");
		System.out.println("Library Fees Per Hours: "+fee+"rs");	
	}	
}
class Book
{
	String title;
	String author;
	double price;

	Book(String title, String aothor, double price)
	{
		this.title=title;
		this.author=author;
		this.price=price;
	}
	public void displayBook()
	{
		System.out.println("******BOOK DETAILS******");
		System.out.println("Book Title: "+title);
		System.out.println("Book Author: "+author);
		System.out.println("Book Price: "+price);
	}

}
class LibraryDriver
{
	public static void main(String[] args) 
	{
		BookLibraryComposition obj =new BookLibraryComposition("Mahalaxmi","Pune",12,50);
		obj.displayLibrary();
		obj.book.displayBook();
	}
}