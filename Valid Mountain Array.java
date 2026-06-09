							Valid Mountain Array


class Solution 
{
    public boolean validMountainArray(int[] arr) 
    {	    
	    int max = -1234;
	    
	    int max_index = 0;
	    
	    boolean one = true;
	    
	    boolean two = true;
	    
	    for(int i=0 ; i<arr.length ; i++)
	    {
	        if(arr[i] >= max)
	        {
	            max = arr[i];
	            max_index = i; 
	        }
	    }

        boolean great1 = false;

        for(int i=0 ; i<max_index ; i++)
        {
            if(arr[i] < max)
            {
                great1 = true;
            }
        }

        boolean great2 = false;

        for(int i=max_index+1 ; i<arr.length ; i++)
        {
            if(arr[i] > max)
            {
                great2 = true;
            }
        }

        if(!great1 && !great2)
        {
            return false;
        }

        if(max_index == 0)
        {
            return false;
        }

        if(max_index == arr.length-1)
        {
            return false;
        }
	    
	    for(int i=0 ; i<max_index ; i++)
	    {
	        if(arr[i] < arr[i+1])
	        {
	            continue;
	        }
	        else 
	        {
	            one = false;
	            break;
	        }
	    }
	    
	    for(int i=max_index ; i<arr.length-1 ; i++)
	    {
	        if(arr[i] > arr[i+1] )
	        {
	            continue;
	        }
	        else 
	        {
	            two = false;
	            break;
	        }
	    }

        System.out.println(one);
        System.out.println(two);

        if(arr.length>2)
        {
            if(arr[max_index-1] <= arr[max_index] && arr[max_index] >= arr[max_index+1])
            {
                if(one && two)
                {
                    return true;
                }
            }
        }
	    
	    if(one && two)
	    {
	       return true;
	    }

        return false;

    }
}