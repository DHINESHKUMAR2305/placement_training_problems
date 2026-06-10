						String Compression III


class Solution 
{
    public String compressedString(String word) 
    {
        char[] arr = word.toCharArray();

        String res = "";

        for(int i=0 ; i<arr.length ; )
        {
            int count = 0;
            int j;

            boolean is_boolean = true;

            for(j=i ; j<arr.length ; j++)
            {
                if(count == 9)
                {
                    res+=count;
                    res+=arr[i];
                    i=j;
                    is_boolean = false;
                    break;
                }
                if(arr[i] == arr[j])
                {
                    count+=1;
                }
                else 
                {
                    break;
                }
            }

            if(is_boolean)
            {
                res+=count;
                res+=arr[i];
            }            
            
            i=j;

        } 


        

        return res;    
    }
}