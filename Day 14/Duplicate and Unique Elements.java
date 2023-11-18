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
		System.out.println("Duplicate Elements");
		for(int num2:ar)
		{
		    if(hs.get(num2)>1)
		    {
		       System.out.print(num2+" ");
		       hs.remove(num2);
		    }
		}
		System.out.println();
		System.out.println("Unique Elements");
		System.out.print(hs.keySet());
	}
}
