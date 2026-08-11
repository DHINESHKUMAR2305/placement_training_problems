																		Replace each consonant with the nearest vowel


import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
		String a = "codebashers";
		
		ArrayList<Integer> xx = new ArrayList<>();
		
		int temp = (int)('a');
		xx.add(temp);
		
		temp = (int)('e');
		xx.add(temp);
		
		temp = (int)('i');
		xx.add(temp);
		
	    temp = (int)('o');
		xx.add(temp);
		
		temp = (int)('u');
		xx.add(temp);
		
		String res = "";
		
		for(char c : a.toCharArray())
		{
		    if( c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u')
		    {
		        int ff = (int) c;
		        
		        int max_one = 3421;
		        
		        int max_value = 0;
		        
		        for(int ii : xx)
		        {
		            int qq = Math.abs(ff - ii);
		            
		            if(qq < max_one)
		            {
		                max_one = qq;
		                max_value = ii;
		            }
		        }
		        
		        res+=(char)max_value;
		        
		    }
		    else 
		    {
		        res+=c;
		    }
		}
		
		System.out.println(res);
		
	}
}