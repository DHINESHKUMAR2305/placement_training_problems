						Check if Word Equals Summation of Two Words


class Solution 
{
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) 
    {
        char[] cc = {'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm',
                    'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z'};

        String temp1 = "";
        for(char c : firstWord.toCharArray())
        {
            for(int i=0 ; i<cc.length ; i++)
            {
                if(c==cc[i])
                {
                    temp1 = temp1+String.valueOf(i);
                    break;
                }
            }
        }

        String temp2 = "";
        for(char c : secondWord.toCharArray())
        {
            for(int i=0 ; i<cc.length ; i++)
            {
                if(c==cc[i])
                {
                    temp2 = temp2+String.valueOf(i);
                    break;
                }
            }
        }

        int res = Integer.valueOf(temp1) + Integer.valueOf(temp2);

        String temp3 = "";
        for(char c : targetWord.toCharArray())
        {
            for(int i=0 ; i<cc.length ; i++)
            {
                if(c==cc[i])
                {
                    temp3 = temp3+String.valueOf(i);
                    break;
                }
            }
        }

        int fin = Integer.valueOf(temp3);

        if(fin == res)
        {
            return true;
        }

        return false;

    }
}