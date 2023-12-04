import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Queue<Integer> g = new LinkedList<>();
		g.add(2);
		g.add(22);
		g.add(222);
		g.add(2222);
		Stack<Integer> st = new Stack<>();
		while(!g.isEmpty())
		{
		    st.push(g.poll());
		}
			while(!st.isEmpty())
		{
		    g.add(st.pop());
		}
		
		//Reverse stsck
		
		ArrayList<Integer> al = new ArrayList<>(g);
		System.out.println(g);
		
	}
}
