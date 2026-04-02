				Count Symmetric Integers

class Solution 
{
    public int countSymmetricIntegers(int low, int high) 
    {
        int count = 0;
        for(int i=low ; i<=high ; i++)
        {
            int temp = i;

            int len = 0;

            while(temp!=0)
            {
                len+=1;
                temp/=10;
            }

            if(len%2==0)
            {
                int xx = len/2;

                temp = i;
                int one = 0;

                while(xx!=0)
                {
                    int pp = temp%10;
                    one+=pp;
                    temp/=10;
                    xx--;
                }

                int two = 0;

                while(temp!=0)
                {
                    int pp = temp%10;
                    two+=pp;
                    temp/=10;
                }

                if(one == two)
                {
                    count+=1;
                }

            }
            else 
            {
                continue;
            }
        }

        return count;
    }
}