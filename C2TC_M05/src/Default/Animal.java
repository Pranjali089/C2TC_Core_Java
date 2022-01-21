package Default;

public class Animal 
{
	int legs;
	String name;
	String color;
	
	public Animal()
	{
		System.out.println("This is default constructor");
	}
	
	public Animal(String name)
	{
		this();
		this.name=name;
	}
	
	public Animal(String name,String color)
	{
		this(name);
		this.color=color;
	}
	
	public Animal(int legs,String name,String color)
	{
		this(name,color);
		this.legs=legs;
	}
}


