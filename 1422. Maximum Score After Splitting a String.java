				1422. Maximum Score After Splitting a String


class Solution 
{
    public int maxScore(String s) 
    {
        int max = 0;
        
        for(int i=0 ; i<s.length() ; i++)
        {
            String temp1 = "";
            String temp2 = "";

            for(int j=0 ; j<=i ; j++)
            {
                if(i==s.length()-1)
                {
                    break;
                }
                temp1+=s.charAt(j);
            }

            for(int j=i+1 ; j<s.length() ; j++)
            {
                temp2+=s.charAt(j);
            }

            System.out.print(temp1);
            System.out.print("->");
            System.out.print(temp2);
            System.out.println();

            int zero = 0;
            int one = 0;

            for(char c : temp1.toCharArray())
            {
                if(c=='0')
                {
                    zero+=1;
                }
            }

            for(char c : temp2.toCharArray())
            {
                if(c=='1')
                {
                    one+=1;
                }
            }

            int res = one+zero;

            max = Math.max(max , res);
        }

        return max;

    }
}