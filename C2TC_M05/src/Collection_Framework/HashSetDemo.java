package Collection_Framework;
import java.util.HashSet;
import java.util.Iterator;
import java.util.SortedSet;
public class HashSetDemo
{

	public static void main(String[] args)
	{
		      SortedSet<String> hs=new SortedSet<String>();
		hs.add("Hash");
		hs.add("Set");
		hs.add("Demo");
		hs.add("Demo");
		Iterator i=hs.iterator();
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(0);
		}
		// TODO Auto-generated method stub

	}

}
