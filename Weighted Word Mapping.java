						Weighted Word Mapping


class Solution 
{
    public String mapWordWeights(String[] words, int[] weights) 
    {
        String res = "";

        for(String s : words)
        {
            String temp = s;

            int sum = 0;

            for(char c : temp.toCharArray())
            {
                int xx = c-'a';

                sum+=weights[xx];

            }

            sum = sum%26;

            int pp = 97+25;

            char oo = (char) (pp-sum);

            res+=oo;
        }

        return res;

    }
}