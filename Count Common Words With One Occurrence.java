						Count Common Words With One Occurrence


class Solution 
{
    public int countWords(String[] words1, String[] words2) 
    {
        HashMap<String , Integer> hm1 = new HashMap<>();

        for(String s : words1)
        {
            hm1.put(s , hm1.getOrDefault(s , 0)+1);
        }

        HashMap<String , Integer> hm2 = new HashMap<>();

        for(String s : words2)
        {
            hm2.put(s , hm2.getOrDefault(s , 0)+1);
        }

        ArrayList<String> one = new ArrayList<>();
        ArrayList<String> two = new ArrayList<>();

        for(Map.Entry<String , Integer> xx : hm1.entrySet())
        {
            if(xx.getValue() ==1)
            {
                one.add(xx.getKey());
            }
        }

        for(Map.Entry<String , Integer> xx : hm2.entrySet())
        {
            if(xx.getValue() ==1)
            {
                two.add(xx.getKey());
            }
        }

        int count = 0;

        for(int i=0 ; i<one.size() ; i++)
        {
            for(int j=0 ; j<two.size() ; j++)
            {
                if(one.get(i).equals(two.get(j)))
                {
                    count+=1;
                }
            }
        }

        return count;

    }
}