import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		String str1=sc.nextLine();
		String str2=sc.nextLine();
		String sub=""; //prriya
		int count=0;
		for(int i=0;i<str1.length();i++)
		{
		    for(int j=0;j<str1.length();j++)
		    {
		        if(str1.charAt(i)==str2.charAt(j))
		        {
		            count++;
		        }
		        
		    }
		}
// 		System.out.print(count);
		if(count==str2.length())
		{
		    System.out.print("Anagram");
		}
		
	}
}
