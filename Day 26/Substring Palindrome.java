/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main //substring is palindrome
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int max=-1;
		String result="";
		for(int i=0;i<str1.length();i++) 
		{
		    for(int j=i+1;j<str1.length();j++)
		    {
		       String temp= str1.substring(i,j);
		        StringBuffer check = new StringBuffer(temp);
		        check.reverse();
		        if(temp.contentEquals(check) && temp.length()>max) //different object same content // Case sensitive
		        {
		            max=temp.length();
		            result=temp;
		        }
		    }
		}
		if(result.length()!=0)
{
    System.out.println(result);
}
else
{
    System.out.println("No palindrome");
}
	}
}
