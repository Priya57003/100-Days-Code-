import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
	    Queue<Integer> st = new LinkedList<>(); //interface
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	        int m = sc.nextInt();
	        st.offer(m);
	    }
	    System.out.println("Displaying the queue elements");
	    for(int show:st)
	    {
	        System.out.println(show);
	    }
	    System.out.println("Removing  the queue element");
	    ArrayList<Integer> al = new ArrayList<>(st);
	    for(int n1:al)
	    {
	        if(!st.isEmpty())
	        {
	           // int element=n;
	            System.out.println(st.poll());
	        }
	        if(st.isEmpty())
	        {
	            System.out.print("queue Empty");
	        }
	    }
	    
	}
}
