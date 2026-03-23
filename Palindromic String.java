
						Palindromic String

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        String res = "";

        for(int i=a.length()-1 ; i>=0 ; i--)
        {
            res+=a.charAt(i);
        }

        if(a.equals(res))
        {
            System.out.println("YES");
        }
        else 
        {
            System.out.println("NO");   
        }
    }
}
