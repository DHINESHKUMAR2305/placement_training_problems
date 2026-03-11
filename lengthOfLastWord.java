
lengthOfLastWord


class Solution 
{
    public int lengthOfLastWord(String s) 
    {
        s = s.trim();

        String[] ss = s.split(" ");

        return ss[ss.length-1].length();    
    }
}