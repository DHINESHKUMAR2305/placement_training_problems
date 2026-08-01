					Greatest English Letter in Upper and Lower Case


class Solution 
{
    public String greatestLetter(String s) 
    {
        char[] a1 = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        char[] a2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        for(char c : s.toCharArray())
        {
            boolean is_boolean = true;
            for(int i=0 ; i<a1.length ; i++)
            {
                if(c == a1[i])
                {
                    a1[i] = '*';
                    is_boolean = false;
                }
            }
            if(is_boolean)
            {
                for(int i=0 ; i<a2.length ; i++)
                {
                    if(c == a2[i])
                    {
                        a2[i] = '*';
                    }
                }
            }
            
        }

        ArrayList<String> xxx = new ArrayList<>();

        for(int i=0 ; i<a1.length ; i++)
        {
            if(a1[i] == '*' && a2[i] == '*')
            {
                char temp = (char) (65+i);
                String res = temp+"";
                xxx.add(res);
            }
        }

        Collections.sort(xxx);

        if(xxx.size()>0)
        {
            return xxx.get(xxx.size()-1);
        }

        return "";

    }
}