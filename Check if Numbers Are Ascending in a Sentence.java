					Check if Numbers Are Ascending in a Sentence


class Solution 
{
    public boolean areNumbersAscending(String s) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        String[] ss = s.split(" ");

        for(int i=0 ; i<ss.length ; i++)
        {
            String temp = ss[i];

            if(Character.isDigit(temp.charAt(0)))
            {
                int val = Integer.valueOf(temp);

                xx.add(val);
            }

        }

        for(int i=0 ; i<xx.size() ; i++)
        {
            for(int j=i+1 ; j<xx.size() ; j++)
            {
                if(xx.get(j) <= xx.get(i))
                {
                    return false;
                }
            }
        }

        return true;

    }
}