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
		//System.out.println("Highest First Element of queue "+queue.element());
		System.out.println("Highest Priority queue of Removed Element "+queue.peek());
// 		System.out.println("Highest First Element of queue "+queue.remove());
		System.out.println(" Elements of queue "+queue);
		//size,isEmpty
		 boolean containsElement = queue.contains(20);
        System.out.println("Queue contains 20: " + containsElement);
        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext())
        {
            int element=iterator.next();
            if(15==element)
            {
                System.out.println("Found");
            }
        }

		
	}
}
