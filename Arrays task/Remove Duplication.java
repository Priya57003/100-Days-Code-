import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		HashMap<Integer,Integer> pg = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		for(int i=0;i<n1;i++)
		{
		    int n=sc.nextInt();
		    if(!pg.containsKey(n))
		    {
		        pg.put(n,1);
		    }
		    
		}
		System.out.print(pg.keySet());
	}
}
