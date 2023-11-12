import java.util.*;
public class Main
{
    public static void Prime(int arr1[][],int n1,int n2)
    {
        
        for(int i=0;i<n1;i++)
        {    
        for(int j=0;j<n2;j++)
        {    
             
        for(int k=2;k<=Math.sqrt(arr1[i][j]);k++)      
        {      
        if(arr1[i][j]%2==0)
        {
            System.out.println("Not a Prime"+arr1[i][j]+" "+i+j);
        }
        else
        {
            System.out.println(" Prime"+arr1[i][j]+" "+i+j);
        }
        }  
         
         } 
         
        }
    }   

       
        
    
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int arr1[][]= new int[n1][n2];
		int arr2[][]= new int[n1][n2];
		for(int i=0;i<n1;i++)
		{
		   for(int j=0;j<n2;j++)
		   {
		       arr1[i][j]=sc.nextInt();
		   }
		}
		
		
	Prime(arr1,n1,n2);
	}
}

