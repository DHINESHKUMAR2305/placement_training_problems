					Find Most Frequent Vowel and Consonant


class Solution 
{
    public int maxFreqSum(String s) 
    {
        HashMap<Character , Integer> hm = new HashMap<>();

        for(char c : s.toCharArray())
        {
            hm.put(c , hm.getOrDefault(c , 0)+1);
        }

        int vowels_count = 0;
        int consants_count = 0;

        for(Map.Entry<Character , Integer> xx : hm.entrySet())
        {
            if(xx.getKey() == 'a' || xx.getKey() == 'e' || xx.getKey() == 'i' || xx.getKey() == 'o' 
            || xx.getKey() == 'u')
            {
                vowels_count = Math.max(vowels_count , xx.getValue());
            }
            else 
            {
                consants_count = Math.max(consants_count , xx.getValue());
            }

        }

        return consants_count+vowels_count;


    }
}