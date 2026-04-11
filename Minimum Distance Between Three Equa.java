			Minimum Distance Between Three Equal Elements I

class Solution 
{
    public int minimumDistance(int[] arr) 
    {
        if(arr.length<3)
        {
            return -1;
        }
        int min = 12345;
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                for(int k=j+1 ; k<arr.length ; k++)
                {
                    if(arr[i] == arr[j] && arr[j] == arr[k] && arr[k] == arr[i])
                    {
                        int one = Math.abs(i-j);
                        int two = Math.abs(j-k);
                        int three = Math.abs(k-i);

                        int sum = one+two+three;

                        min = Math.min(min , sum);
                    }
                }
            }   
        }

        if(min == 12345)
        {
            return -1;
        }
        return min;
    }
}