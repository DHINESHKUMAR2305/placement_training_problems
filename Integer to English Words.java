						Integer to English Words

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
	    int n = 9170;
	    
	    String[] one = {"" , "one" , "two" , "three" , "four" , "five" , "six" , "seven",
	        "eight" , "nine" , "ten" , "eleven" , "twelve" , "thirteen" , "fourteen" , "fifteen" , 
	        "sixteen" , "seventeen" , "eighteen" , "nineteen"
	    };
	    
	    String[] ten = {"" , "" , "tewnty" , "thirty" , "fourty" , "fifty" , "sixty" , "seventy" , 
	        "eighty" , "ninty" 
	    };
	    
	    String res = "";
	    
	    
	    if(n>=1000)
	    {
	        res+=one[n/1000]+" thousand ";
	        n%=1000;
	    }
	    
	    if(n>=100)
	    {
	        res+=one[n/100]+" hundred ";
	        n%=100;
	    }
	    
	    if(n>=20)
	    {
	        res+=ten[n/10]+ " ";
	        n%=10;
	    }
	    
	    if(n>0)
	    {
	        res+=one[n];
	    }
	    
	    res+=" only";
	    
	    System.out.println(res.trim());

	    
	}
}