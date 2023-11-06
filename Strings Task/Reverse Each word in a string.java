import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1[] = sc.nextLine().split(" ");
		String rev="";
		for(int i=0;i<str1.length;i++)
		{
		    String str2=str1[i];
		    for(int j=str2.length()-1;j>=0;j--)
		    {
		         rev+=str2.charAt(j);
		         
		    }
		   
		    rev+=" ";
		}
		System.out.print(rev);
		
	
	}
}
-----------------------------------------------------------------------------------------
	public class Main
{
	public static void main(String[] args) 
	{
	    String str1 ="this is world";
	    String result="";
	    for(int i=str1.length()-1;i>=0;i--)
	    {
	        result+=str1.charAt(i)+"";
	    }
		System.out.println("Reverse Each String: "+result);
	}
}


