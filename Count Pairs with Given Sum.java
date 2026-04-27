					Count Pairs with Given Sum

import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
	   // Input: [1,5,7,-1,5], k=6
    //      Output: 3
    
        int[] arr = {1,2,3,4};
        
        int k = 5;
        
        int count = 0;
        
        for(int i=0 ; i<arr.length ; i++)
        {
            for(int j=i+1 ; j<arr.length ; j++)
            {
                if(arr[i]+arr[j] == k)
                {
                    count++;
                }
            }
        }
        
        System.out.println(count);
        
        
	}
}