					Find the Array Concatenation Value


class Solution 
{
    public long findTheArrayConcVal(int[] arr) 
    {
        int left = 0;
        int right = arr.length-1;

        long res = 0;

        while(left<right)
        {
            int temp1 = arr[left];
            int temp2 = arr[right];
            
            String temp = ""+temp1+temp2;

            System.out.println(temp);

            long a = Long.valueOf(temp);
            res+=a;
            left++;
            right--;

        }  
        if(arr.length%2!=0)
        {
            int mid = arr.length/2;
            res+=arr[mid];
        }  
        
        return res;
    }
}