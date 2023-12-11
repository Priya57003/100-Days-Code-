import java.util.Arrays;
public class Main
{
	public static void main(String[] args) 
	{
		int[] arr1={20,30,50};
		int[] arr2={45,89,8};
		//Method overloading concepts used here that uses Arrays.equals(a,b)
		boolean res=Arrays.equals(arr1,arr2);
		System.out.println(res);
	}
}
