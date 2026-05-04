					Maximum Substrings With Distinct Start


class Solution 
{
    public int maxDistinct(String s) 
    {
        String res = "";

        int count = 0;

        for(int i=0 ; i<s.length() ; i++)
        {
            for(int j=i+1 ; j<=s.length() ; j++)
            {
                String temp = s.substring(i , j);

                char c = temp.charAt(0);

                String cc = c+"";

                if(!res.contains(cc))
                {
                    count+=1;
                    res+=cc;
                }

            }
        }

        return count;

        // --------------------------------------

        HashSet<Character> xx = new HashSet<>();

        for(char c : s.toCharArray())
        {
            xx.add(c);
        }

        return xx.size();

    }
}