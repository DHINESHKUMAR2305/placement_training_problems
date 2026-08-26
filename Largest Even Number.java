						Largest Even Number


class Solution 
{
    public String largestEven(String s) 
    {
        String res = "";

        for(int i=s.length()-1 ; i>=0 ; i--)
        {
            if(s.charAt(i) == '0' || s.charAt(i) == '2' ||  s.charAt(i) == '4' || s.charAt(i) == '6' || 
            s.charAt(i) == '8')
            {
                for(int j=0 ; j<=i ; j++)
                {
                    res+=s.charAt(j);
                }
                break;
            }    
        }

        return res;

    }
}