							Longest Palindromic Subsequence


class Solution 
{
    public int longestPalindromeSubseq(String s) 
    {
        HashSet<String> res = new HashSet<>();

        int lengthh = -123;

        helper(s , 0 , "" , res);

        for(String ss : res)
        {
            String temp = ss;

            String temp2 = "";

            for(int i=temp.length()-1 ; i>=0 ; i--)
            {
                temp2+=temp.charAt(i);
            }

            if(temp.equals(temp2))
            {
                lengthh = Math.max(lengthh , temp2.length());
            }

        }

        return lengthh;

    }

    public static void helper(String s , int index , String temp , HashSet<String> res)
    {
        if(s.length() == index)
        {
            res.add(temp);
            return;
        }

        helper(s , index+1 , temp+s.charAt(index) , res);
        helper(s , index+1 , temp , res);

    }

}