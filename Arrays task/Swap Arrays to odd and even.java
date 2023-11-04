
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5]; 
        for(int i=0;i<4;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<4;i++)
        {
            if(i==4-1)
            {
                break;
            }
            else if(arr[i]%2==0 && i%2==0)
            {
                arr[i]=arr[i];
            }
            else
            {
                int temp = arr[i];
                arr[i]=arr[i+1];
                arr[i+1]=temp;
                i++;
            }
            
        }
        for(int i=0;i<4;i++)
        {
            System.out.println(arr[i]);
        }
	}
}
