import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	    Stack<Integer>st = new Stack<>();
	    int T = sc.nextInt();
	    int n = sc.nextInt();
	    int min=Integer.MAX_VALUE;
	    for(int i=0;i<T;i++)
	    {
	        int c=0;
	        for(int j=0;j<n;j++)
	        {
	            int n1=sc.nextInt();
	            
	            if(n1<=min)
	            {
	                min=n1;
	                st.push(1);
	            }
	            else
	            {
	                st.push(2);
	            }
	           
	        }
	        for(int k=0;k<n;k++)
	        {
	            System.out.print(st.pop());
	        }
	        
	    }
	}
}
