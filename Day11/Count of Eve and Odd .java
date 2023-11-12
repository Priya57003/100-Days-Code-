import java.util.*;
public class Main
{
    public static void EvenOdd(int arr[][],int n1,int n2)
    {
        int even=0,odd=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                int n=arr[i][j];
                if(n-(2*(n/2))==0)
                {
                    even++;
                }
                else
                {
                    odd++;
                }
            }
        }
        System.out.println(even);
        System.out.println(odd);
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int arr[][]= new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
		   for(int j=0;j<n2;j++)
		   {
		       arr[i][j]=sc.nextInt();
		   }
		}
		EvenOdd(arr,n1,n2);
	}
}
