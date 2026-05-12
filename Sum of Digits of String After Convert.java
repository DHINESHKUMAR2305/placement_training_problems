					Sum of Digits of String After Convert


class Solution 
{
    public int getLucky(String s, int k) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0 ; i<s.length() ; i++)
        {
            int val = (int) s.charAt(i);
            arr.add(val-96);
        }    

        int sum = 0;
        
        int count = 0;

        for(int i : arr)
        {
            int temp = i;

            while(temp!=0)
            {
                int dummy = temp%10;
                sum+=dummy;
                temp/=10;
            }
        }

        count+=1;

        if(count == k)
        {
            return sum;
        }

        while(k!=count)
        {
            int xx = 0;

            while(sum!=0)
            {
                int dummy = sum%10;
                xx+=dummy;
                sum/=10;
            }
            sum = xx;
            count++;
        }

        return sum;
    }
}