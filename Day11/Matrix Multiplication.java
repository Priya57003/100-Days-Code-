import java.util.*;
public class Main
{
    public static void Multiplication(int arr1[][],int arr2[][],int n1,int n2)
    {
        int c[][]=new int[n1][n2];
        for(int i=0;i<n1;i++){    
        for(int j=0;j<n2;j++){    
         c[i][j]=0;      
        for(int k=0;k<n1;k++)      
        {      
        c[i][j]+=arr1[i][k]*arr2[k][j];      
        }  
        System.out.print(c[i][j]+" ");   
         } 
         System.out.println();
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
		for(int i=0;i<n1;i++)
		{
		   for(int j=0;j<n2;j++)
		   {
		       arr2[i][j]=sc.nextInt();
		   }
		}
		
		Multiplication(arr1,arr2,n1,n2);
	}
}

