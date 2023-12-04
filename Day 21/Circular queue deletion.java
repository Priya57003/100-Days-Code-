import java.util.*;
public class Main
{
  int front = 0, rear = 0;
  public boolean isFull ()
  {
    int size=3;
    int diff = Math.abs (front - rear);
    if (diff==size-1)		//f-r=size-1
      {
	return true;
      }
    return false;
  }
  int front1;
  public void cQueue (int queue[], int var1)
  {
    //circular queue isFull
    int size = 3;
    if (isFull ())
      {
	    System.out.println ("Queue is Full");
      }


    // if(front1 == -1)
    // {
    //     front1=0;
    //     rear=0;
    //     queue[0]=var1;

    // }

    rear = ++rear % size;
    queue[rear] = var1;
    
  }
  public void deque(int queue[])
  {
      int size=3;
      if(front==-1)
      {
          System.out.println("Queue is Empty");
      }
      int del=queue[front];
      front= ++front % size;
      System.out.println("F :"+front);
      System.out.println("Del:"+del);
  }
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    Main ob = new Main ();
    int queue[] = new int[3];
    ob.cQueue (queue, 3);
    ob.cQueue (queue, 4);
    ob.cQueue (queue, 5);
    System.out.print (Arrays.toString (queue));
    // System.out.print("rear"+rear);
    for(int i=0;i<3;i++)
    ob.deque(queue);

  }
}
