		Reverse Letters Then Special Characters in a String

class Solution 
{
    public String reverseByType(String s) 
    {
        char[] c = s.toCharArray();

        int left = 0;
        int right = c.length-1;

        while(left<right)
        {
            if(!Character.isLetter(c[left]))
            {
                left++;
            }
            if(!Character.isLetter(c[right]))
            {
                right--;
            }

            if(Character.isLetter(c[left]) && Character.isLetter(c[right]))
            {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }

        left = 0;
        right = c.length-1;

        while(left<right)
        {
            if(Character.isLetter(c[left]))
            {
                left++;
            }
            if(Character.isLetter(c[right]))
            {
                right--;
            }

            if(!Character.isLetter(c[left]) && !Character.isLetter(c[right]))
            {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }

        String res = "";

        for(char cc : c)
        {
            res+=cc;
        }

        System.out.println(Arrays.toString(c));

        return res;

    }
}