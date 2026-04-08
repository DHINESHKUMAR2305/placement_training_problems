					Shuffle String


class Solution 
{
    public String restoreString(String s, int[] indices) 
    {
        char[] c = s.toCharArray();

        char[] cc = new char[indices.length];

        for(int i=0 ; i<indices.length ; i++)
        {
            char temp = c[i];
            int ii = indices[i];
            char temp2 = c[ii];
            cc[ii] = temp;
            c[i] = temp2;
        }

        String res = "";

        for(char ccc : cc)
        {
            res+=ccc;
        }

        System.out.println(Arrays.toString(cc));

        return res;

    }
}