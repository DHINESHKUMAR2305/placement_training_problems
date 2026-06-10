							Permutation in String

class Solution 
{
    public boolean checkInclusion(String s1, String s2) 
    {
        char[] a = s1.toCharArray();

        Arrays.sort(a);

        String aa = new String(a);

        for(int i=0 ; i<s2.length() ; i++)
        {
            for(int j=i+1 ; j<=s2.length() ; j++)
            {
                String temp = s2.substring(i , j);

                char[] bb = temp.toCharArray();

                Arrays.sort(bb);

                String temp2 = new String(bb);

                if(temp2.length() == aa.length())
                {
                    if(temp2.equals(aa))
                    {
                        return true;
                    }
                }

            }
        }

        return false;

    }
}