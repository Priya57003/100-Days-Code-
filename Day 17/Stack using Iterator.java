import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Stack<String> st = new Stack<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		    
		    String str1 = sc.nextLine();
		    st.push(str1);
		}
		Iterator<String> It = st.iterator();
		while(It.hasNext())
		{
		    String str2=It.next();
		    if(str2.equals("PriyaGowtham"))
		    {
		        System.out.println("They Present inside");
		    }
		}
		
	}
}
