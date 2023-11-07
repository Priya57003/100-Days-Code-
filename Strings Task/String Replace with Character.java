import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		System.out.println("Before Replacing character"+str1);
		str1=str1.replaceAll("a","G");
		System.out.println("After Replacing character"+str1);
	}
}
