						Maximum Length Substring With Two Occurrences


class Solution {

    public int maximumLengthSubstring(String s) 
    {
        String fin = "";

        for(int i=0 ; i<s.length() ; i++)
        {
            for(int j=i+1 ; j<=s.length() ; j++)
            {
                String temp = s.substring(i  , j);

                HashMap<Character , Integer> hm = new HashMap<>();

                for(char c : temp.toCharArray())
                {
                    hm.put(c , hm.getOrDefault(c , 0)+1);
                }

                int count = 0;
                int new_count = 0;

                for(Map.Entry<Character , Integer> xx : hm.entrySet())
                {
                    if(xx.getValue() == 2)
                    {
                        count+=1;
                    }
                    else if(xx.getValue()>2)
                    {
                        new_count+=1;
                    }
                }

                if(count >= 1 && new_count == 0)
                {
                    if(temp.length() > fin.length())
                    {
                        fin = temp;
                    }
                }

            }
        }

        System.out.println(fin);

        if(fin.isEmpty())
        {
            return s.length();
        }

        return fin.length();
    }
}