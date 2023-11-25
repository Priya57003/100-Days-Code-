import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		PriorityQueue<Integer>queue = new PriorityQueue<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = sc.nextInt();
		    queue.add(m);
		}
		System.out.println("Highest First Element of queue "+queue.peek());
		System.out.println("Highest Priority queue of Removed Element "+queue.poll());
		System.out.println(" Elements of Priorityqueue "+queue);
		
	}
}
