							Top K Frequent Elements


class Solution 
{
    public int[] topKFrequent(int[] nums, int k) 
    {
        HashMap<Integer , Integer> hm = new HashMap<>();

        for(int i : nums)
        {
            hm.put(i , hm.getOrDefault(i , 0)+1);
        }

        int[] arr1 = new int[hm.size()];
        int[] arr2 = new int[hm.size()];

        System.out.println(hm);

        int arr_count = 0;

        for(Map.Entry<Integer , Integer> xx : hm.entrySet())
        {
            arr1[arr_count] = xx.getKey();
            arr2[arr_count] = xx.getValue();
            arr_count+=1;
        }

        for(int i=0 ; i<arr2.length ; i++)
        {
            for(int j=i+1 ; j<arr2.length ; j++)
            {
                if(arr2[i] < arr2[j])
                {
                    int temp = arr2[i];
                    arr2[i] = arr2[j];
                    arr2[j] = temp;

                    int temp2 = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp2;
                }
            }
        }

        int[] res = new int[k];
        int res_count = 0;

        for(int i=0 ; i<k ; i++)
        {
            res[i] = arr1[i];
        }

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        return res;

    }
}