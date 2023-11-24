import java.util.*;
public class Main
{
    public static void Enque(int queue[],int size,int front,int rear)
    {
        
		
		if(front==0 && rear==size-1)
		{
		    System.out.println("Queue is Full");
		}
	
    }
    public static void display(int queue[],int size) 
    {
        for(int i=0;i<size;i++)
        {
           System.out.println(queue[i]);
        }
    }
	    
    public static void Deque(int queue[],int front,int rear)
    {
        
        int element=0;
        // rear=size-1;
        if(front==-1 && rear==-1)
        {
           System.out.println("EMPTY QUEUE");
        }
        else
        {
           
            if(front>=rear)// only one element present in array
            {
              System.out.println("Last element present in the queue is"+ queue[front]);// all elements are deleted queue is empty
               front=-1;
               rear=-1;
               Deque(queue,front,rear);
               
            }
            else{
                
                element=queue[front];
                System.out.println(element);
                Deque(queue,front+1,rear);// next element is present in the queue
                
            }
        }
        
        
    }
	public static void main(String[] args) 
	{
	    Scanner sc = new Scanner(System.in);
		Main obj = new Main();
		int size=sc.nextInt();
		int queue[] = new int[size];
		for(int i=0;i<size;i++)
		{
		    queue[i]=sc.nextInt();
		}
	    int front=0;
		int rear=size-1;
// 		int queue[] = new int[size];
		Enque(queue,size,front,rear);
		display(queue,size);
		Deque(queue,front,rear);
	
		
		
		
	}
}
