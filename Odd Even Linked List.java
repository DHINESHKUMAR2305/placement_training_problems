					Odd Even Linked List


class Solution 
{
    public ListNode oddEvenList(ListNode head) 
    {
        ArrayList<Integer> odd = new ArrayList<>();

        ListNode temp = head;

        while(temp!=null)
        {
            odd.add(temp.val);
            temp = temp.next;
        }

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for(int i=0 ; i<odd.size() ; i+=2)
        {
            current.next = new ListNode(odd.get(i));
            current = current.next;
        }

        for(int i=1 ; i<odd.size() ; i+=2)
        {
            current.next = new ListNode(odd.get(i));
            current = current.next;
        }

        System.out.println(odd);

        return dummy.next;

    }
}