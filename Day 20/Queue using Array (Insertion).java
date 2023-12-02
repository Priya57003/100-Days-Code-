import java.util.*;
public class Main
{
    
    int front,rear;
    
    Main()
    {
     front=-1;
     rear=-1;
    }
    public  void enque(int queue[],int size,int element)
    {
        //No element is present in the queue so set to zero
        if(front==-1)
        {
            front=0;
        }
        
            ++rear;
            queue[rear]=element;
        
        
        System.out.print(Arrays.toString(queue));
    }
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Main ob = new Main();
		int size = sc.nextInt();
		int queue[] = new int[size];
		
		for(int i=0;i<size;i++)
		{
		    int element=sc.nextInt();
		ob.enque(queue,size,element);
		}
// 		displayQueue(queue,size);
   
	}
}
