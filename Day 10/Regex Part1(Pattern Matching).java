import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		Pattern pt = Pattern.compile("!@#");
		Matcher mt = pt.matcher(str1);
		while(mt.find())
		{
		    System.out.println(mt.group()+"Starts at"+mt.start()+"ends at"+mt.end());
		}
	}
}
