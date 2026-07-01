				Longest Substring Of All Vowels in Order



class Solution 
{
    public int longestBeautifulSubstring(String word) 
    {
        int max = 0;
        for(int i=0 ; i<word.length() ; i++)
        {
            for(int j=i+1 ; j<=word.length() ; j++)
            {
                String temp = word.substring(i , j);

                if(temp.contains("a") && temp.contains("e") && temp.contains("i")
                && temp.contains("o") && temp.contains("u"))
                {
                    char[] cc = temp.toCharArray();
                    Arrays.sort(cc);
                    String new_temp = new String(cc); 

                    if(temp.equals(new_temp))
                    {
                        max = Math.max(max , temp.length());
                    }
                }

            }
        } 

        return max;   
    }
}