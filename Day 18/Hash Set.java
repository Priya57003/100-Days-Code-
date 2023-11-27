import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		HashSet<Integer> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int m = sc.nextInt();
		    hs.add(m);
		}
		System.out.println("The Elements Presents in the HASH SET:");
		Iterator<Integer> it = hs.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
	}
}
