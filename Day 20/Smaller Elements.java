import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[4];
		for(int i=0;i<4;i++)
		{
		    arr[i] = sc.nextInt();
		}
		for(int i=arr.length-1;i>0;i--)
		{
		    int temp = arr[i];
		    for(int j=i-1;j>=0;j--)
		    {
		        if(temp<arr[j])
		        {
		            System.out.println(arr[j]);
		        }
		        else
		        {
		             System.out.println(-1);
		        }
		    }
		}
	}
}
