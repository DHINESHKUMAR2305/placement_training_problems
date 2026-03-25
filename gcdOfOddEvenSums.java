
						gcdOfOddEvenSums

class Solution 
{
    public int gcdOfOddEvenSums(int n) 
    {
        int odd_count = 0;

        long odd = 0;

        int even_count = 0;
        long even = 0;

        for(int i=1 ; i<10000 ; i++)
        {
            if(i%2==0)
            {
                even+=i;
                even_count++;
            }

            if(even_count == n)
            {
                break;
            }
        }    

        for(int i=1 ; i<10000 ; i++)
        {
            if(i%2!=0)
            {
                odd+=i;
                odd_count++;
            }

            if(odd_count == n)
            {
                break;
            }
        } 

        long min = Math.min(odd , even);

        long gcd = 1;

        for(int i=1 ; i<min ; i++)
        {
            if(even%i==0 && odd%i==0)
            {
                gcd = i;
            }
        }

        return (int)gcd;

    }
}