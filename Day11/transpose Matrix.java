import java.util.*;
public class Main
{
    public static void transpose(int arr[][],int n1,int n2)
    {
        int transpose[][]=new int[n1][n2];
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                transpose[j][i]=arr[i][j];
            }
        }
       for(int i=0;i<n1;i++)
       {
           for(int j=0;j<n2;j++)
           {
                System.out.print(transpose[i][j]+" ");
           }
           System.out.println(" ");
       }
        
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
		
		transpose(arr,n1,n2);
	}
}
