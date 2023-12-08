import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Set<Integer> obj = new HashSet<>();
		obj.add(2000);
		obj.add(980);
		obj.add(789);
        int Max=Collections.max(obj);
        int Min=Collections.min(obj);
		System.out.println(Max);
		System.out.println(Min);
	}
}
