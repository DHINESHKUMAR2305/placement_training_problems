					Sort Array by Increasing Frequency


class Solution 
{
    public int[] frequencySort(int[] nums) 
    {
        
        TreeMap<Integer , Integer> hm = new TreeMap<>();

        for(int i : nums)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }

        ArrayList<Integer> one = new ArrayList<>();
        ArrayList<Integer> two = new ArrayList<>();

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            for(int i=0 ; i<xx.getValue() ; i++)
            {
                one.add(xx.getKey());
                two.add(xx.getValue());
            } 
        }

        int[] first = new int[one.size()];
        int[] second = new int[one.size()];

        int first_count = 0;

        for(int i : one)
        {
            first[first_count++] = i;
        }

        int second_count = 0;
        
        for(int i : two)
        {
            second[second_count++] = i;
        }

        for(int i=0 ; i<second.length ; i++)
        {
            for(int j=i+1 ; j<second.length ; j++)
            {
                if(second[i] > second[j])
                {
                    int temp1 = second[i];
                    second[i] = second[j];
                    second[j] = temp1;
                    int temp2 = first[i];
                    first[i] = first[j];
                    first[j] = temp2;
                }
                else if(second[i] == second[j])
                {
                    if(first[i] < first[j])
                    {
                        int temp2 = first[i];
                        first[i] = first[j];
                        first[j] = temp2;
                    }
                }
            }
        }

        
        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        return first;

    }
}