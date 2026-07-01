				Count of Substrings Containing Every Vowel and K Consonants I


class Solution 
{
    public int countOfSubstrings(String word, int k) 
    {
        int res = 0;

        for(int i=0 ; i<word.length() ; i++)
        {
        
            for(int j=i+1 ; j<=word.length() ; j++)
            {
                boolean aa = false;
                boolean ee = false;
                boolean ii = false;
                boolean oo = false;
                boolean uu = false;

                int constant = 0;
                               
                String temp = word.substring(i , j);

                for(char c : temp.toCharArray())
                {
                    if(c == 'a')
                    {
                        aa = true;
                    }
                    else if(c == 'e')
                    {
                        ee = true;
                    }
                    else if(c == 'i')
                    {
                        ii = true;
                    }
                    else if(c == 'o')
                    {
                        oo = true;
                    }
                    else if(c == 'u')
                    {
                        uu = true;
                    }
                    else 
                    {
                        constant+=1;
                    }
                }

                if(aa && ee&& ii&&oo&&uu)
                {
                    if(constant == k)
                    {
                        res+=1;
                    }
                }

            }


        }    

        return res;

    }
}