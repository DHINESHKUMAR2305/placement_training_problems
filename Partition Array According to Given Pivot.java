						Partition Array According to Given Pivot

class Solution 
{
    public int[] pivotArray(int[] nums, int pivot) 
    {
        ArrayList<Integer> less = new ArrayList<>();

        ArrayList<Integer> great = new ArrayList<>();

        ArrayList<Integer> equal = new ArrayList<>();

        for(int i : nums)
        {
            if(i < pivot)
            {
                less.add(i);
            }
            else if(i > pivot)
            {
                great.add(i);
            }
            else 
            {
                equal.add(i);
            }
        }

        int[] arr = new int[nums.length];

        int arr_count = 0;

        for(int i : less)
        {
            arr[arr_count++] = i;
        }

        for(int i : equal)
        {
            arr[arr_count++] = i;
        }

        for(int i : great)
        {
            arr[arr_count++] = i;
        }

        System.out.println(less);
        System.out.println(great);

        return arr;

    }
}