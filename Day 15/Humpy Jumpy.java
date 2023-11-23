import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
      Scanner sg=new Scanner(System.in);
        int n =sg.nextInt();   
          int res[]=new int[n] ;    
        for(int i=0;i<n;i++)
        {
           res[i]= sg.nextInt(); 
        }

        int max=-100;

        for(int i=0;i<n;i++)
        {
            Stack<Integer>stack=new Stack<>();
            int xor=0;
            for(int j=i;j<n;j++)
            {

            if(stack.isEmpty())
            {
                stack.push(res[j]);
                xor=res[j];
            }
            else
            {      //last       //current
                if(stack.peek()<res[j])
                {

                xor=xor^res[j];
                stack.push(res[j]);
                }

            }

            }
             max=Math.max(xor,max);
        }
       
              
        System.out.println(max);    // Writing output to STDOUT
    }
}
