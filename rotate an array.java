						rotate an array

class Solution 
{
    public void rotate(int[] arr, int k) 
    {
        int left = 0;
        int right = arr.length-1;

        k = k%arr.length;

        rr(arr , left , right);
        rr(arr ,left , k-1);
        rr(arr , k,right);
        

        System.out.println(Arrays.toString(arr));
    }

    public void rr(int[] arr , int left , int right)
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