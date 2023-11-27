import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		ArrayList<String>al= new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0;i<n;i++)
		{
		    String m = sc.nextLine();
		     al.add(m);
		}
		HashSet<String> hs1 = new HashSet<>(al);
		Iterator<String>it=hs1.iterator();
		while(it.hasNext())
		{
		    System.out.println(it.next());
		}
		
	}
}
