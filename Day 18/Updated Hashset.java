import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		HashSet<String> hs = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		    String m = sc.nextLine();
		    hs.add(m);
		}
		System.out.println("The Elements Presents in the HASH SET:");
		Iterator<String> it = hs.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		System.out.println("Creating Another Hashed Set");
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("Priya");
		hs1.add("Engineer");
		hs.addAll(hs1);
		System.out.println("Updated HashSet:");
		System.out.println(hs);
	}
}
