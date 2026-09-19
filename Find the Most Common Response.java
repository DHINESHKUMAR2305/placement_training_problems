						Find the Most Common Response


class Solution 
{
    public String findCommonResponse(List<List<String>> arr) 
    {
        HashMap<String , Integer> hm = new HashMap<>();

        for(int i=0 ; i<arr.size() ; i++)
        {
            List<String> temp = arr.get(i);
            HashSet<String> pp = new HashSet<>();

            for(String s : temp)
            {
                pp.add(s);
            }

            for(String s : pp)
            {
                hm.put(s , hm.getOrDefault(s , 0)+1);
            }
        }

        int max = 0;

        for(Map.Entry<String , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() > max)
            {
                max = xx.getValue();
            }
            System.out.println(xx.getKey()+" =>"+xx.getValue());
        }

        ArrayList<String> res = new ArrayList<>();

        for(Map.Entry<String , Integer> xx : hm.entrySet())
        {
            if(xx.getValue() == max)
            {
                res.add(xx.getKey());
            }
        }

        Collections.sort(res);

        return res.get(0);

    }
}