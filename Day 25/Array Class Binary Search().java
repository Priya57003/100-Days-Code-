//If the input list is not sorted, the results are undefined.
//If there are duplicates, there is no guarantee which one will be found.
//index of the search key, if it is contained in the array; otherwise, (-(insertion point) – 1). The insertion point is defined as the point at which the key would be inserted into the array: the index of the first element greater than the key, or a.length if all elements in the array are less than the specified key. Note that this guarantees that the return value will be >= 0 if and only if the key is found.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr1[]={1,78,98};
		int key1=708;
		char arr2={'A','b','c'};
		char key2='c';
		Arrays.sort(arr2);
		Arrays.sort(arr1);
		System.out.println(Arrays.binarySearch(arr1,key1));
		System.out.println(Arrays.binarySearch(arr2,key2));
		
	}
}
