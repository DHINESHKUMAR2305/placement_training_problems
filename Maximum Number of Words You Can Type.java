						Maximum Number of Words You Can Type

class Solution 
{
    public int canBeTypedWords(String text, String br) 
    {
        String[] ss = text.split(" ");

        int count = 0;

        
        for(int i=0 ; i<ss.length ; i++)
        {
            String temp = ss[i];

            boolean isboolean = true;

            for(int ii=0 ; ii<br.length() ; ii++)
            {
                for(int jj=0 ;jj<temp.length() ; jj++)
                {
                    if(temp.charAt(jj) == br.charAt(ii))
                    {
                        isboolean = false;
                        break;
                    }
                }
            }

            if(isboolean)
            {
                count+=1;
            }

        }

        return count;

    }
}