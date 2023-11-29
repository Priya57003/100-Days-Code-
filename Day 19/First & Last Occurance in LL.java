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
      ll.add("def");
      ll.add("def");
      ll.add ("ghi");
      System.out.println("LinkedList1:");
	  System.out.println(ll);
      
     
       ll.removeFirstOccurrence("def"); //Remove the first DEF string 
      System.out.println (" removeFirstOccurence of element from  LinkedList1:"+ll);
      ll.removeLastOccurrence("ghi"); //remove the last Ghi string 
       System.out.println ("removeLastOccurance Last of element from  LinkedList1:"+ll);
      
      

  }
}
