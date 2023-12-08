import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Set<Character> obj = new HashSet<>();
		Set<String> obj1 = new HashSet<>();
	    for(char ch='a';ch<='z';ch++)
	    {
	        obj.add(ch);
	    }
        Iterator<Character> it = obj.iterator();
        while(it.hasNext())
        {
            String str1=it.next()+"";
            if(str1.matches("[aeiouAEIOu]"))
            {
                obj1.add(str1);
            }
        }
        System.out.print(obj1);
	}
}
