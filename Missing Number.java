					 Missing Number

class Solution 
{
    public int missingNumber(int[] arr) 
    {		
		boolean mm = true;
		
		Arrays.sort(arr);		
		
		int missing = 0;
		
		for(int i=0 ; i<arr.length-1 ; i++)
		{
		    if(arr[i]+1 !=arr[i+1])
		    {
		        missing = arr[i]+1;
		        mm = false;
		        break;
		    }
		}
		
		if(mm && arr[0] == 0)
		{
		    missing = arr[arr.length-1]+1;
		}
		
		if(arr[0] != 0)
		{
		    missing = 0;
		}
		
		return missing;
    }
}