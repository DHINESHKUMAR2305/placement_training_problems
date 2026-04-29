					Toggle String



import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception 
    {
        Scanner scan = new Scanner(System.in);

        String a = scan.nextLine();

        String res = "";

        for(char c : a.toCharArray())
        {
            if(c>='a' && c<='z')
            {
                res+=(char)(c-32);
            }
            else 
            {
                res+=(char)(c+32);
            }
        }

        System.out.println(res);

    }
}
