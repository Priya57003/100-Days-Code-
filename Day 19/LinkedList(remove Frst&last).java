import java.util.*;
public class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
      LinkedList < String > ll = new LinkedList <> ();
      ll.add ("ABC");//0
      ll.add ("def");//1
      ll.add ("ghi");//2
      System.out.println("LinkedList1:");
	  System.out.println(ll);
      LinkedList < String > ll2 = new LinkedList <> ();
      ll2.add ("MNO");//1
      ll2.add ("Pqr");//2
    //Updation of element in Linked List
      ll.addAll (ll2);
     
      ll.removeFirst();
      System.out.println ("Remove First of element from  LinkedList1:"+ll);
      ll.removeLast();
       System.out.println ("Remove Last of element from  LinkedList1:"+ll);
      
      

  }
}
