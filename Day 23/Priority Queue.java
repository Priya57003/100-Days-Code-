import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
// 		System.out.println("Hello World");
        Queue<Integer> qu = new PriorityQueue<>();
        qu.add(10);
        qu.add(120);
        qu.add(30);
        qu.add(40);
        System.out.println("Picking up the First Element of the queue "+qu.peek());
        System.out.println("Deleting the First Element of the queue "+qu.poll());
        System.out.println("Showing the Elements of the queue "+qu.poll()); //Priority is based on the less value
        
	}
}
