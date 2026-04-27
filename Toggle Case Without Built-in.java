				Toggle Case Without Built-in

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
        // 👉 Input: "AbC"
        // 👉 Output: "aBc"
        
        String a = "AbcD";
        
        String res = "";
        
        for(int i=0 ; i<a.length() ; i++)
        {
            char temp = a.charAt(i);
            
            if(temp >= 'A' && temp<='Z')
            {
                res+=(char)(temp+32);
            }
            else 
            {
                res+=(char)(temp-32);
            }
        }
        
        System.out.println(res);
        
        
	}
}