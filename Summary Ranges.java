					Summary Ranges

class Solution 
{
    public List<String> summaryRanges(int[] arr) 
    {
        ArrayList<String> new_arr = new ArrayList<>();
        for(int i=0 ; i<arr.length ; )
        {
            int pp = i;
            if( i < arr.length-1 && arr[i+1] == arr[i]+1)
            {
                int j = i;
                for(; j<arr.length-1 ; j++)
                {
                    if(arr[j]+1 != arr[j+1])
                    {
                        break;
                    }
                }
                String l = String.valueOf(arr[pp]);
                String ll = String.valueOf(arr[j]);

                new_arr.add(l+"->"+ll);
                i = j+1;
            }
            else 
            {
                String temp = String.valueOf(arr[i]);
                new_arr.add(temp);
                i++;
            }
        }

        return new_arr;
    }
}