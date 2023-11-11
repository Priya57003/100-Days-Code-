import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int Max=0;
		int n = sc.nextInt();
		sc.nextLine();
		String str3="";
		for(int i=0;i<n;i++)
		{
		    String str1 = sc.nextLine();
		    int count=0;
		    for(int j=0;j<str1.length();j++)
		    {
		        String str2=str1.charAt(j)+"";
		        if("AEIOUaeuio".contains(str2))
		        {
		            count++;
		            
		        }
		    }
		    if(count>Max)
		    {
		        Max=count;
		        str3=str1; 
		    }
		}
		System.out.println(Max);
		System.out.println(str3);
		
		
	}
}

