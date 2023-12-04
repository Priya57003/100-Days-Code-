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


  
    rear = ++rear % size;
    queue[rear] = var1;
    
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

  }
}
