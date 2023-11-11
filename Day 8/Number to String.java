import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int one=n%10;//1
		int quot=n/10;
		int ten=quot%10;//2
		int hun=n/100;//3
		String ones[]={" ","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","ninteen"};
		String tens[]={" ","Ten","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty"};
		String hundred="hundred";
		if(n<0 || n>999)
		{
		    System.out.print("Wrong Input");
		}
		else
		{
		    if(n<20)
		    {
		        System.out.print(ones[n]);
		    }
		    else if(n<100)
		    {
		        System.out.print(tens[ten]+ones[one]);
		    }
		    else
		    {
		        System.out.print(ones[hun]+" "+hundred+" "+tens[ten]+ones[one]);
		    }
		}
	}
}
