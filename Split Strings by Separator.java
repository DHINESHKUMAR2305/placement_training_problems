					Split Strings by Separator


import java.util.*;
import java.util.regex.Pattern;

class Solution 
{
    public List<String> splitWordsBySeparator(List<String> words, char separator) 
    {

        String ss = separator+"";

        ss = Pattern.quote(ss);

        ArrayList<String> xx = new ArrayList<>();

        for(String s : words)
        {
            String temp = s;

            String[] temp2 = temp.split(ss);

            for(String i : temp2)
            {
                if(!i.isEmpty())
                {
                    xx.add(i);
                }
            }
        }

        return xx;

    }
}