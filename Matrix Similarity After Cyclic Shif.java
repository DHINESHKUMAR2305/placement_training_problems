			Matrix Similarity After Cyclic Shifts


class Solution 
{
    public boolean areSimilar(int[][] arr, int k) 
    {
        int[][] tt = new int[arr.length][arr[0].length];

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                tt[i][j] = arr[i][j];
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            int left = 0;
            int right = arr[0].length-1;
            k = k%arr[0].length;

            if(i%2==0)
            {
                even(arr[i] , left , k-1);
                even(arr[i] , k , right);
                even(arr[i] , left , right);
            }
            else 
            {
                odd(arr[i] , left , right);
                odd(arr[i] , left , k-1);
                odd(arr[i] , k , right);
                
            }
        }

        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=0 ; j<arr[0].length ; j++)
            {
                if(tt[i][j] != arr[i][j])
                {
                    return false;
                }
            }
        }

        return true;
    }

    public void even(int[] arr , int left , int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    public void odd(int[] arr , int left , int right)
    {
        while(left < right)
        {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
    
}