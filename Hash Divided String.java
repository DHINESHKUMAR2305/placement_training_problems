					Hash Divided String

class Solution 
{
    public String stringHash(String s, int k) 
    {	    
	    char[] c = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm'
	        , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z'
	    };
	    
	    
	    String res = "";
	    
		for(int i=0 ; i<s.length() ; i+=k)
        {
            String temp = "";
            for(int j=i ; j<i+k ; j++)
            {
                temp+=s.charAt(j);
            }
            
            int sum = 0;
            
            for(int ii=0 ; ii<temp.length() ; ii++)
            {
                for(int jj=0 ; jj<c.length ; jj++)
                {
                    if(temp.charAt(ii) == c[jj])
                    {
                        sum+=jj;
                    }
                }
            }
            
            sum = sum%26;
            
            res+=c[sum];
        }  
        
        return res;
    }
}