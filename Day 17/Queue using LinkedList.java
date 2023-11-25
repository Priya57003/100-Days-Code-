import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Queue<Integer>queue = new LinkedList<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = sc.nextInt();
		    queue.add(m);
		}
		System.out.println("First Element of queue "+queue.peek());
		System.out.println("Removed Element of queue "+queue.peek());
		System.out.println(" Elements of queue "+queue);
		
	}
}
