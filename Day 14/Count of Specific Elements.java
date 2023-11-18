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
		ArrayList<Integer> ar = new ArrayList<>(hs.keySet());
		System.out.println("Count of unique Elements");
		int count=0;
		for(int num2:ar)
		{
		    if(hs.get(num2)==1)
		    {
		       count++;
		    }
		}
			System.out.println(count);
		
	}
}
