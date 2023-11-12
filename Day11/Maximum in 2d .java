import java.util.*;
public class Main
{
    public static void findOccurance(int arr[][],int n1,int n2)
    {
        int Max=Integer.MIN_VALUE;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr[i][j]>Max)
                {
                   Max=arr[i][j];
                }
            }
        }
        System.out.println(Max);
        
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
		
		findOccurance(arr,n1,n2);
	}
}
