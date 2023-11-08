import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String rev = "";
		for(int i=0;i<str1.length();i++)
		{
		    String vow=str1.charAt(i)+"";
		    if("AEIOUaeiou".contains(vow))
		    {
		        rev+=vow;
		    }
		}
		StringBuffer ob = new StringBuffer(rev);
		System.out.print(ob.reverse());
	}
}
