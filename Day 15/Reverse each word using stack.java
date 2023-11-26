import java.io.*;

import java.util.*;
 

class Main {

    static void reverseWords(String str)

    {

        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < str.length(); ++i) {

            if (str.charAt(i)!=' ')

                st.push(str.charAt(i));

            else {

                while (st.empty() == false) {

                    System.out.print(st.pop());

                }

                System.out.print(" ");

            }

        }

        while (st.empty() == false) {
            String str1=st.pop()+"";
            System.out.print(str1);

        }

    }
    public static void main(String[] args)

    {

        String str = "Geeks for priya";

        reverseWords(str);

    }
}
