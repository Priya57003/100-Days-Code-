import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Set<String> obj = new HashSet<>();
		obj.add("Gowtham");
		obj.add("Loves");
		obj.add("Priya");
		Iterator<String> it = obj.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		    
		}
	}
}
