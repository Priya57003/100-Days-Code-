import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int s=n;
		for(int i=0;i<n;i++)
		{
		    for(int j=s-1;j>=0;j--)
		    {
		        System.out.print(" ");
		    }
		    for(int k=0;k<n;k++)
		    {
		        System.out.print("*");
		    }
		    System.out.println(" ");
		    s--;
		   
		}
	}
}
