package generics;
class GenericTest <T>
{
	T obj;
	void add(T obj)
	{
		this.obj=obj;
	}
	T get()
	{
		return obj;
	}
}
public class GenericClassDemo {
public static void main (string[] args)
{
	GenericTest<Integer> obj1=new GenericTest<Integer> ();
	GenericTest<Integer> obj;
	obj.add(2);
    System.out.println(obj.get());
    Generic Test <String> obj1=new obj1.add("Hi");
    System.out.println(obj1.get());
}
}
