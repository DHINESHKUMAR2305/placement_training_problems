					Count Subarrays with Sum = K

import java.util.*;

public class Main
{
	public static void main(String[] args) 
	{
        // Input: [1,1,1], k=2
        // 👉 Output: 2
        
        int[] arr = {1,1,1};
        
        int kk = 2;
        
        int count = 0;
        
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i ; j<arr.length ; j++)
            {
                ArrayList<Integer> xx = new ArrayList<>();
                for(int k=i ; k<=j ; k++)
                {
                    xx.add(arr[k]);
                }
                
                int sum = 0;
                for(int ii : xx)
                {
                    sum+=ii;
                }
                
                if(sum == kk)
                {
                    count+=1;
                }
                
            }
        }
        
        System.out.println(count);
        
        
	}
}