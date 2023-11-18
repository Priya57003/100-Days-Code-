import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		HashMap<Integer,Integer> hs = new HashMap<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int num1 = sc.nextInt();
		    if(!hs.containsKey(num1))
		    {
		        hs.put(num1,1);
		    }
		    else
		    {
		        hs.put(num1,hs.get(num1)+1);
		    }
		}
			System.out.println(hs.size());
		ArrayList<Integer> ar = new ArrayList<>(hs.keySet());
		for(int num2:ar)
		{
		    if(hs.get(num2)==1)
		    {
		        
		        hs.remove(num2);
		    }
		}
		System.out.println(hs.keySet());
		System.out.println("The size of HashMap ");
		System.out.println(hs.size());
	}
}
