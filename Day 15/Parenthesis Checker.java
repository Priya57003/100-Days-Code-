/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> st = new Stack<>();
		String str1 = sc.nextLine();
		boolean flag=true;
		for(int i=0;i<str1.length();i++)
		{
		    char ch = str1.charAt(i);
		    if(ch=='['||ch=='('||ch=='{')
		    {
		        st.push(ch);
		    }
		    else
		    {
		        
		        if(st.isEmpty())
		        {
		            flag=false;
		            break;
		            
		        }
		        else
		        {
		            char last=st.pop();
		            if(last ==')' && ch =='(')
		            {
		                continue;
		            }
		            else if(last ==']' && ch =='[')
		            {
		                continue;
		            }
		            else if(last =='}' && ch=='{')
		            {
		                continue;
		            }
		            else
		            {
		                if(flag==false)
		                System.out.println("Not balanced");
		            }
		        }
		    }
		}
		if(flag==true)
		{
		    System.out.print("BALANCED");
		}
	}
}
