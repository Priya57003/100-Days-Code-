import java.util.*;
public class Main implements Comparator
{
    // Main is not abstract and does not override abstract method compare(Object,Object) in Comparator
    @Override
    public int compare(Object o1,Object o2)
    {
        String s1 =(String)o1;
        String s2 =(String)o2;
        
        if(s1.length()>s2.length())
         return -1;
         else if(s1.length()<s2.length())
          return 1;
          else
          return 0;
        //  positive -->asc unless desc
    }
	public static void main(String[] args) 
	{
		Main ob = new Main();
// 		ob.compare("PriyaGowtham","AdityaAdithi");
		
         String arr[]={"sdfg","zasd","Aqwe","fgh","iuyt"};
		Arrays.sort(arr,ob);
		System.out.println(Arrays.toString(arr));
		
	}
}
