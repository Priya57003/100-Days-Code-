
import java.util.*;
public class Main
{
    public static void findOccurance(int arr[][],int n1,int n2,int target)
    {
        int count=0;
        for(int i=0;i<n1;i++)
        {
            for(int j=0;j<n2;j++)
            {
                if(arr[i][j]==target)
                {
                    count++;
                }
            }
        }
        System.out.println("Number of Occurances of target"+count);
        
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
		System.out.println("Enter element need to be found");
		int target = sc.nextInt();
		findOccurance(arr,n1,n2,target);
	}
}
