					Count the Number of Consistent Strings


class Solution 
{
    public int countConsistentStrings(String a, String[] arr) 
    {
        int count = 0;

        for(String s : arr)
        {
            String temp = s;

            boolean boo = true;

            

            for(int i=0 ; i<temp.length() ; i++)
            {
                boolean is_boolean = false;

                for(int j=0 ; j<a.length() ; j++)
                {
                    if(temp.charAt(i) == a.charAt(j))
                    {
                        is_boolean = true;
                        break;
                    }
                }
                if(!is_boolean)
                {
                    boo = false;
                    break;
                }
                else 
                {
                    continue;
                }
            }

            if(boo)
            {
                count+=1;
            }

        }

        return count;

    }
}