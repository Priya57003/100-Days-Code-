import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Set<String> obj = new HashSet<>();
		obj.add("Priya");
		obj.add("Loves");
		obj.add("Coding");
		Iterator<String> it = obj.iterator();
		while(it.hasNext())
		{
		   String var1 = it.next();
		   if(var1.equals("Loves"))
		   {
		       it.remove();
		   }
		    
		}
		System.out.println(obj);
	}
}
