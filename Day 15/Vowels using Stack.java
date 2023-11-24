import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<>();
		String str1 = sc.nextLine();
		
		for(int i=0;i<str1.length();i++)
		{
		    String ch = str1.charAt(i)+"";
		    st.push(ch);
		}
		System.out.println("Name which contains vowels Character are removed");
		ArrayList<String> at = new ArrayList<>(st);
		for(int i=0;i<at.size();i++)
		{
		    String str = str1.charAt(i)+"";
		    if(st.isEmpty())
		    {
		        System.out.println("Stack is empty");
		    }
		    if("aeiouAEIOU".contains(str))
		    {
		        st.remove(str);
		        
		    }
		}
		System.out.println(st);
			System.out.println("The size of stack "+st.size());
	}
}
