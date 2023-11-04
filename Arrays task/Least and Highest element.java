import java.util.*;
class Main
  {
    public static void highestNum(int arr[],int n)
    {
      int Max=Integer.MAX_VALUE;
      for(int i=0;i<n;i++)
        {
          if(Max>arr[i])
          {
            Max=arr[i];
          }
        }
      System.out.println(Max);
    }
     public static void leastNum(int arr[],int n)
    {
      int Min=Integer.MIN_VALUE;
      for(int i=0;i<n;i++)
        {
          if(Min<arr[i])
          {
            Min=arr[i];
          }
        }
      System.out.println(Min);
    }
    public static void main(String args[])
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
        {
          arr[i]=sc.nextInt();
        }
      highestNum(arr,n);
      leastNum(arr,n);
    }
  }
