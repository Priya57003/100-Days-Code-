import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Deque<Integer> dq = new ArrayDeque<>();
		int first=sc.nextInt();
		System.out.println("People are entering in the front door:");
		for(int i=0;i<first;i++)
		{
		    int n = sc.nextInt();
		    dq.addFirst(n);
		}
		System.out.println("People are entering in the back door:");
		for(int i=0;i<first;i++)
		{
		    int n = sc.nextInt();
		    dq.addLast(n);
		}
		System.out.println("People are leaving from the front door");
		for(int i=0;i<first;i++)
		{
		    System.out.println(dq.pollFirst());
		    
		}
			System.out.println("People are leaving from the back door");
		for(int i=0;i<first;i++)
		{
		    System.out.println(dq.pollLast());
		    
		}
	}
}
