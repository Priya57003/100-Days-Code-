/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Scanner get=new Scanner(System.in);
		String s1=get.nextLine();
		String s2=get.nextLine();
		if(s1.compareTo(s2)>0)
		{
		    System.out.println("s1>s2");
		}
        else if(s1.compareTo(s2)<0)
		{
		    System.out.println("s1<s2");
		}		
		else if(s1.compareTo(s2)==0)
		{
		    System.out.println("s1==s2");
		}
	}
		
	}
}

