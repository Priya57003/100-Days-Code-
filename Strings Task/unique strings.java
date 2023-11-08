import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		for(int i=0;i<str1.length();i++)
		{
		    int flag=0;
		    for(int j=i+1;j<str1.length();j++)
		    {
		        if(str1.charAt(i)==str1.charAt(j))
		        {
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0)
		    {
		        System.out.println(str1.charAt(i));
		    }
		}
	}
}
