import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String,Integer>Hs = new HashMap<>();
		String str1 = sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
		    String str2 = str1.charAt(i)+"";
		    if(!Hs.containsKey(str2))
		    {
		        Hs.put(str2,1);//key:value
		    }
		    else
		    {
		        Hs.put(str2,Hs.get(str2)+1);
		    }
		}
// 		System.out.print(Hs.keySet());
// 		System.out.print(Hs.get());
		ArrayList<String> al = new ArrayList<>(Hs.keySet());
		for(String str3:al)
		{
		    if(Hs.get(str3)==1)
		    {
		        System.out.print(str3+" ");
		    }
		}
	}
}
