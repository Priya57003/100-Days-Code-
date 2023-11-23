import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	     int T = sc.nextInt();
	    int arr[] = new int[n];
	   
	    Stack<Integer> st =new Stack<>();
	    int c=0;
	    for(int i=0;i<n;i++)
	    {
	        arr[i] = sc.nextInt();
	    }
	    int min=Integer.MIN_VALUE;
	    int element=0;
	    for(int i=0;i<T;i++)
	    {
	        min=Math.max(min,arr[i]);
	        st.push(min);
	       
	    }
	     System.out.print(st.peek());
	}
}
