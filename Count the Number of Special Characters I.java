						Count the Number of Special Characters I


class Solution 
{
    public int numberOfSpecialChars(String word) 
    {
        HashSet<Character> hs = new HashSet<>();

        for(int i=0 ; i<word.length() ; i++)
        {
            if(Character.isLowerCase(word.charAt(i)))
            {
                String temp = word.charAt(i)+"";
                temp = temp.toUpperCase();
                for(int j=0 ; j<word.length() ; j++)
                {
                    if(i==j)
                    {
                        continue;
                    }
                    String temp2 = word.charAt(j)+"";
                    if(temp.equals(temp2))
                    {
                        hs.add(word.charAt(i));
                    }
                }
            }
            else 
            {
                String temp = word.charAt(i)+"";
                temp = temp.toLowerCase();
                for(int j=0 ; j<word.length() ; j++)
                {
                    if(i==j)
                    {
                        continue;
                    }
                    String temp2 = word.charAt(j)+"";
                    if(temp.equals(temp2))
                    {
                        hs.add(word.charAt(i));
                    }
                }
            }
        }

        return hs.size()/2;

    }
}