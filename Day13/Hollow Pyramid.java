import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c=0;
		for(int i=0;i<n;i++)
		{
		    
		    for(int s=0;s<n-i-1;s++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0;j<2*i+1;j++)
		    {
		        if(j==0||j==(2*i)||i==n-1)
		        {
		            System.out.print("*");
		        }
		        else
		        {
		            System.out.print(" ");
		        }
		        
		    }
		    System.out.println(" ");
		    
		    
		}
		
	}
}
