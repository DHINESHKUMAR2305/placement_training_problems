					Self Dividing Numbers

class Solution 
{
    public List<Integer> selfDividingNumbers(int left, int right) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=left ; i<=right ; i++)
        {
            int temp = i;

            int xx = temp;

            boolean is_boolean = true;

            while(temp!=0)
            {
                int rem = temp%10;

                if(rem == 0)
                {
                    is_boolean = false;
                    break;
                }
                else if(xx%rem != 0)
                {
                    is_boolean = false;
                    break;
                }
                else 
                {
                    temp/=10;
                }
            }

            if(is_boolean)
            {
                arr.add(xx);
            }

        }

        return arr;

    }
}