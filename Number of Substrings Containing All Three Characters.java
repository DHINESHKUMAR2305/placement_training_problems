				Number of Substrings Containing All Three Characters


class Solution 
{
    public int numberOfSubstrings(String s) 
    {
        int count = 0;

        for(int i=0 ; i<s.length() ; i++)
        {
            for(int j=i+1 ; j<=s.length() ; j++)
            {
                boolean aa = false;
                boolean bb = false;
                boolean cc = false;

                String temp = s.substring(i , j);

                if(temp.contains("a"))
                {
                    aa = true;
                }
                if(temp.contains("b"))
                {
                    bb = true;
                }
                if(temp.contains("c"))
                {
                    cc = true;
                }

                if(aa && bb && cc)
                {
                    count+=1;
                }
            }
        }

        return count;

    }
}