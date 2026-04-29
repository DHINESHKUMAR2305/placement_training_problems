					Replace All Digits with Characters

class Solution 
{
    public String replaceDigits(String s) 
    {
        char[] c = s.toCharArray();

        for(int i=0 ; i<c.length ; i++)
        {
            if(Character.isDigit(c[i]))
            {
                char temp = c[i-1];
                String xx = c[i]+"";
                int one = Integer.valueOf(xx);
                int two = temp;

                int res = one+two;

                char mm =(char) res;

                c[i] = mm;

            }
        } 

        String fin = "";

        for(char cc : c)
        {
            fin+=cc;
        }

        return fin;
    }
}