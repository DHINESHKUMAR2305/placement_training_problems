				Process String with Special Operations I


class Solution 
{
    public String processStr(String s) 
    {

        String ss = "";

        for(char c : s.toCharArray())
        {
            if(Character.isLetter(c))
            {
                ss+=c;
            }
            else if( c == '#')
            {
                ss+=ss;
            }
            else if(c == '%')
            {
                StringBuilder xx = new StringBuilder();
                xx.append(ss);
                xx.reverse();
                ss = xx.toString();
            }
            else if(c=='*')
            {
                String temp = "";

                for(int i=0 ; i<ss.length()-1 ; i++)
                {
                    temp+=ss.charAt(i);
                }

                ss = temp;
            }
        }

        return ss;

    }
}