import java.util.Comparator;
public class Main
{
    public int compare(Object o1,Object o2)
    {
        String s1 =(String)o1;
        String s2 =(String)o2;
        int result=s1.compareTo(s2);
        if(result>0)
         return 1;
         else if(result<0)
          return -1;
          else
          return 0;
         
    }
	public static void main(String[] args) 
	{
		Main ob = new Main();
		int res=ob.compare("PriyaGowtham","AdityaAdithi");
		System.out.println(res);
	}
}
