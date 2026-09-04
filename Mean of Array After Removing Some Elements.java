				Mean of Array After Removing Some Elements


class Solution 
{
    public double trimMean(int[] arr) 
    {
        Arrays.sort(arr);
        
        int index = (int)(arr.length*5)/100;

        double ans = 0;
        for(int i=0+index ; i<arr.length-index ; i++)
        {
            ans+=arr[i];
        }

        ans = ans/(arr.length-(index*2));

        return ans;    
    }
}