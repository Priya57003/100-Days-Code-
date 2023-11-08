import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		int arr[] = new int[256];
		for(int i=0;i<str1.length();i++)
		{
		    arr[(int)str1.charAt(i)]++;
		}
		int flag=1;
	
		    for(int j=0;j<256;j++)
		    {
		        if(arr[j]>1 && arr[j]!=0)
		        {
		            System.out.println("Frequency More than one "+(char)j);
		        }
		        else if(arr[j]==1)
		        {
		            System.out.println("Frequency equal to one "+(char)j);
		        }
		        
		        
		        
		    }
		   
		
		
// 		for(int i=0;i<str1.length();i++) //priyaa
// 		{
// 		    int flag=0;
// 		    for(int j=0;j<256;j++)
// 		    {
// 		         if(arr[j]>1)
// 		         {
// 		             flag=1;
// 		         }
		         
// 		    }
// 		    if(flag==1)
// 		   System.out.print(str1.charAt(i));
		    
// 		}
		
	}
}
