					Merge Strings Alternately

class Solution 
{
    public String mergeAlternately(String w1, String w2) 
    {
        int min = Math.min(w1.length() , w2.length());
        int index = 0;

        String res = "";

        for(int i=0 ; i<min ; i++)
        {
            res+=w1.charAt(index);
            res+=w2.charAt(index);
            index+=1;
        }

        System.out.println(index);

        if(index == w1.length())
        {
            for(int i=index ; i<w2.length() ; i++)
            {
                res+=w2.charAt(i);
            }
        }

        if(index == w2.length())
        {
            for(int i=index ; i<w1.length() ; i++)
            {
                res+=w1.charAt(i);
            }
        }

        return res;

    }
}