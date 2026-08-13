					Count Indices With Opposite Parity


class Solution 
{
    public int[] countOppositeParity(int[] arr) 
    {
        int[] res = new int[arr.length];

        for(int i=0 ; i<arr.length ; i++)
        {
            int count = 0;

            if(arr[i]%2 == 0)
            {
                for(int j=i+1 ; j<arr.length ; j++)
                {
                    if(arr[j]%2!=0)
                    {
                        count+=1;
                    }
                }   
            }
            else 
            {
                for(int j=i+1 ; j<arr.length ; j++)
                {
                    if(arr[j]%2 == 0)
                    {
                        count+=1;
                    }
                } 
            }

            res[i] = count;
            
        }

        return res;

    }
}