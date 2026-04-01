					reorderSpaces


class Solution 
{
    public String reorderSpaces(String a) 
    {
        char[] c = a.toCharArray();

        int space_count = 0;

        for(char cc : c)
        {
            if(cc == ' ')
            {
                space_count+=1;
            }
        }

        String[] ss = a.split(" ");
        int word_count = 0;

        for(String s : ss)
        {
            if(!s.isEmpty())
            {
                word_count+=1;
            }
        }

        if(word_count<2 && space_count == 0)
        {
            return a;
        }

        if(word_count == 1 && space_count >0)
        {
            String oo = "";
            
            for(String io : ss)
            {
                if(!io.isEmpty())
                {
                    oo+=io;
                }
            }

            for(int i=0; i <space_count ; i++)
            {
                oo+=" ";
            }

            return oo;
        }

        int formula =  space_count/(word_count-1);

        String res = "";

        for(int pp = 0; pp<ss.length ; pp++)
        {
            if(!ss[pp].isEmpty())
            {
                res+=ss[pp];

                for(int ii=0 ; ii<formula ; ii++)
                {
                    res+=" ";
                    space_count-=1;
                }
            }
        }

        res = res.trim();

        space_count+=formula;
        System.out.println(formula);
        System.out.println(space_count);

        if(space_count > 0)
        {
            for(int i=0 ; i<space_count ; i++)
            {
                res+=" ";
            }
        }

        return res;
    }
}