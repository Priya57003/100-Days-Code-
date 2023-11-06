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

