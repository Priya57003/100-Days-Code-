import java.util.*;
class Main
  {
    
    public static void sum(int arr[],int n)
    {
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]>0)
            sum+=arr[i];
            
        }
        System.out.print(sum);
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
        // int tot=0;
     sum(arr,n);
    }
  }
