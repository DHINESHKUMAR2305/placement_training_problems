				Next Greater Node In Linked List

class Solution 
{
    public int[] nextLargerNodes(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while(temp!= null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }

        int[] res = new int[arr.size()];
        int res_count = 0;

        for(int i=0 ; i<arr.size() ; i++)
        {
            int xx = 0;
            for(int j=i+1 ; j<arr.size() ; j++)
            {
                if(arr.get(j) > arr.get(i))
                {
                    xx = arr.get(j);
                    break;
                }
            }
            res[res_count++] = xx;
        }

        System.out.println(Arrays.toString(res));
        
        return res;

    }
}