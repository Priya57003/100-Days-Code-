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
		//second string
		String str3 = sc.nextLine();
		for(int i=0;i<str3.length();i++)
		{
		    String str4 = str3.charAt(i)+"";
		    if(Hs.containsKey(str4))
		    {
		        Hs.put(str4,Hs.get(str4)-1); //key:value
		    }
		    
		}

		ArrayList<String> al = new ArrayList<>(Hs.keySet());
		int flag=0;
		for(String str5:al)
		{
		    if(Hs.get(str5)==0)
		    {
		        flag=1;
		    }
		    
		}
		if(flag==1)
		{
		    System.out.println("A");
		}
		else
		{
		    System.out.println("NA");
		}
	}
	
}
		   
		
	
