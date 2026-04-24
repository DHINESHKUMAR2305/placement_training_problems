					Uncommon Words from Two Sentences

class Solution 
{
    public String[] uncommonFromSentences(String s1, String s2) 
    {
        HashMap<String , Integer> hm = new HashMap<>();

        String[] ss1 = s1.split(" ");    
        String[] ss2 = s2.split(" ");  

        for(String i : ss1)
        {
            hm.put(i , hm.getOrDefault( i , 0)+1);
        }

        for(String i : ss2)
        {
            hm.put(i , hm.getOrDefault( i , 0)+1);
        }

        ArrayList<String> arr = new ArrayList<>();

        for(Map.Entry<String , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() ==1)
            {
                arr.add(xx.getKey());
            }
        }

        String[] res = new String[arr.size()];
        int res_count = 0;

        for(String s : arr)
        {
            res[res_count++] = s;
        }

        return res;

    }
}