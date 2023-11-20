import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<Character> st =new Stack<>();
		String str = sc.nextLine();
		for(int i=0;i<str.length();i++)
		{
		    char ch=str.charAt(i);
		    st.push(ch);
		}
		String rev="";
		for(int i=0;i<str.length();i++)
		{
		    rev+=st.pop();
		}
		System.out.print(rev);
	}
}
