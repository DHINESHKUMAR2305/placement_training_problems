
					Container With Most Water



class Solution 
{
    public int maxArea(int[] arr) 
    {
        int left = 0;
        int right = arr.length-1;

        int res = -12345;

        while(left < right)
        {
            int height = Math.min(arr[left] , arr[right]);
            int width = right - left;

            int area = height * width;

            res = Math.max(res , area);

            if(arr[left] < arr[right])
            {
                left++;
            }
            else
            {
                right--;
            }          
        }

        return res;
    }
}