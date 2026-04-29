						Vowels Game in a String

class Solution 
{
    public boolean doesAliceWin(String s) 
    {
        if(s.contains("a"))
        {
            return true;
        }
        else if(s.contains("e"))
        {
            return true;
        }
        else if(s.contains("i"))
        {
            return true;
        }
        else if(s.contains("o"))
        {
            return true;
        }
        else if(s.contains("u"))
        {
            return true;
        }

        return false;
    }
}