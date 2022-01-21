package Default;
import java.util.*;
public class Scanner_Ex 
{
      public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("sum is "+(a+b));
	Scanner_Ex obj=new Scanner_Ex();
	System.out.println(sc.getClass());
	System.out.println(obj.hashCode());
	System.out.println(obj.getClass());// TODO Auto-generated method stub

	}

}
