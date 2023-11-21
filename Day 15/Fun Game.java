import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		Stack<String> st = new Stack<>();
		int n = sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
		    arr[i]=sc.nextInt();
		}
		int B = arr[n-1];
		for(int i=0;i<n;i++)
		{
		    if(arr[i]<B)
		    {
		        st.push("2");
		    }
		    else if(arr[i]<B)
		    {
		        st.push("1");
		    }
		    else
		    {
		        st.push("0");
		    }
		}
		String rev="";
		for(int i=0;i<n;i++)
		{
		    rev=rev+" "+st.pop();
		}
		StringBuffer sb = new StringBuffer(rev);
		System.out.println(sb.reverse());
		
	}
}
