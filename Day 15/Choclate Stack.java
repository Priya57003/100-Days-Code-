import java.util.*;
public class Main
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Stack<Integer> st = new Stack<>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
		    int n1 = sc.nextInt();
		    if(n1>0)
		    {
		        st.push(n1);
		    }
		}
		HashMap<Integer,Integer> HM = new HashMap<>();
		while(!st.isEmpty())
		{
		    int element=st.pop();
		    if(!HM.containsKey(element))
		    {
		        
		        HM.put(element,1);
		    }
		    else
		    {
		        HM.put(element,HM.get(element)+1);
		    }
		}
		ArrayList<Integer> At = new ArrayList<>(HM.keySet());
		for(int num:At)
		{
		    if(HM.get(num)==1)
		    {
		        System.out.print(num);
		    }
		    else if(HM.get(num)==2)
		    {
		        System.out.print(num);
		    }
		}
	}
}
