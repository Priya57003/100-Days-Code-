import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr1[]={1,78,98};
		int arr2[]={2,78,98};
		int index=Arrays.mismatch(arr1,arr2);
		System.out.println(index);
		int arr3[]={1,78,98};
		int arr4[]={1,78,98};
		int index2=Arrays.mismatch(arr3,arr4);
		System.out.println(index2);
		
	}
}
