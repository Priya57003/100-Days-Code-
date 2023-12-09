import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
        Queue<Integer> qu = new PriorityQueue<>();
        qu.add(10);
        qu.add(120);
        qu.add(30);
        qu.add(40);
        qu.add(30);
        qu.add(30);
        //Priority is based on the less value
        System.out.println("Elements of QUEUE1: "+qu.hashCode());
        System.out.println("Elements of QUEUE1: "+qu.remove(40));
        System.out.println("Elements of QUEUE1: "+qu.contains(120));
        Queue<Integer> qu1 = new PriorityQueue<>();
        qu1.add(120);
        qu1.add(30);
        qu1.addAll(qu);
        System.out.println("Elements of QUEUE2 "+qu1.containsAll(qu));
        
        
        
	}
}
