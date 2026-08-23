						Sort Characters By Frequency


class Solution 
{
    public String frequencySort(String s) 
    {
        String res = "";

        TreeMap<Character , Integer> hm = new TreeMap<>();

        for(char c : s.toCharArray())
        {
            hm.put(c ,  hm.getOrDefault(c , 0)+1);
        }
        ArrayList<Integer> arr = new ArrayList<>();

        for(Map.Entry<Character , Integer> xx : hm.entrySet())
        {
            arr.add(xx.getValue());
        }       

        Collections.sort(arr);
        Collections.reverse(arr);

        System.out.println(arr);
        System.out.println(hm);

        HashSet<Character> hs = new HashSet<>();

        for(int i=0 ; i<arr.size() ; i++)
        {
            int temp = arr.get(i);

            for(Map.Entry<Character , Integer> xx : hm.entrySet())
            {
                if(temp == xx.getValue())
                {
                    if(!hs.contains(xx.getKey()))
                    {
                        for(int ii=1 ; ii<=temp ; ii++)
                        {
                            res+=xx.getKey();
                        }
                        hs.add(xx.getKey());
                    }
                }
                
            }
            
        }

        return res;

    }
}