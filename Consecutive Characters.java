				Consecutive Characters

class Solution 
{
    public int maxPower(String s) 
    {
        char[] c = s.toCharArray();

        int max = -1234;

        int ppp = 0;
        

        for(int i=0 ; i<c.length ; i++)
        {
            int count = 1;

            for(int j=i+1 ; j<c.length ; j++)
            {
                if(c[i] == c[j])
                {
                    count++;
                }
                else 
                {
                    break;
                }
            }

            max = Math.max(max , count);
            count = 0;
        }  
        
        if(max == -1234)
        {
            return ppp;
        }

        return max;

    }
}