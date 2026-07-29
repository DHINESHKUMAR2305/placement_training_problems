				Compare Version Numbers


class Solution 
{
    public int compareVersion(String v1, String v2) 
    {
        String[] arr1 = v1.split("\\.");
        String[] arr2 = v2.split("\\.");

        int d1 = Integer.valueOf(arr1[arr1.length-1]);
        int d2 = Integer.valueOf(arr2[arr2.length-1]);

        if(arr1.length == arr2.length)
        {
            for(int i=0 ; i<arr1.length ; i++)
            {
                int temp1 = Integer.valueOf(arr1[i]);
                int temp2 = Integer.valueOf(arr2[i]);

                if(temp1 == temp2)
                {
                    continue;
                }
                else if(temp1 < temp2)
                {
                    return -1;
                }
                else 
                {
                    return 1;
                }

            }
            
        }
        else if(arr1.length > arr2.length)
        {
            for(int i=0 ; i<arr2.length ; i++)
            {
                int temp1 = Integer.valueOf(arr1[i]);
                int temp2 = Integer.valueOf(arr2[i]);
                if(temp1 == temp2)
                {
                    continue;
                }
                else if(temp1 < temp2)
                {
                    return -1;
                }
                else 
                {
                    return 1;
                }
            }

            for(int i=arr2.length ; i<arr1.length ; i++)
            {
                int temp1 = Integer.valueOf(arr1[i]);
                if(temp1 >= 1)
                {
                    return 1;
                }
            }
        }
        else if(arr1.length < arr2.length)
        {
            for(int i=0 ; i<arr1.length ; i++)
            {
                int temp1 = Integer.valueOf(arr1[i]);
                int temp2 = Integer.valueOf(arr2[i]);
                if(temp1 == temp2)
                {
                    continue;
                }
                else if(temp1 < temp2)
                {
                    return -1;
                }
                else 
                {
                    return 1;
                }
            }

            for(int i=arr1.length ; i<arr2.length ; i++)
            {
                int temp1 = Integer.valueOf(arr2[i]);
                if(temp1 >= 1)
                {
                    return -1;
                }
            }
        }

        return 0;

    }
}