import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        
		        if(i==1)
		        {
		            System.out.println("*");
		        }
		        else if(i==n)
		        {
		            System.out.print("* ");
		        }
		        
		       
		    }
		  //  System.out.println();
		   
		}
	}
}
