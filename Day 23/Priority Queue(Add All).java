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
        //Priority is based on the less value
        System.out.println("Elements of QUEUE1 "+qu);
        Queue<Integer> qu1 = new PriorityQueue<>();
        qu1.add(100);
        qu1.add(200);
        qu1.addAll(qu);
        System.out.println("Elements of QUEUE2 "+qu1);
        
        
        
	}
}
