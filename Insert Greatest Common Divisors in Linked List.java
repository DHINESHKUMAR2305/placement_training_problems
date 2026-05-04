					Insert Greatest Common Divisors in Linked List


class Solution 
{
    public ListNode insertGreatestCommonDivisors(ListNode head) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null)
        {
            arr.add(temp.val);
            temp = temp.next;
        }   

        ArrayList<Integer> gcd = new ArrayList<>();

        for(int i=1 ; i<arr.size() ; i++)
        {
            int one = arr.get(i);
            int two = arr.get(i-1);

            int min = Math.min(one , two);
            int gcdd = 1;

            for(int ii=2 ; ii<=min ; ii++)
            {
                if(one%ii==0 && two%ii==0)
                {
                    gcdd = ii;
                }
            }
            gcd.add(gcdd);
        }

        ListNode dummy = new ListNode(0);

        ListNode current = dummy;

        int xx = 0;

        for(int i=0 ; i<arr.size() ; i++)
        {
            current.next = new ListNode(arr.get(i));
            current = current.next;

            if(xx<gcd.size())
            {
                current.next = new ListNode(gcd.get(xx));
                xx++;
                current = current.next;
            }
            
           
        }

        return dummy.next;

    }
}