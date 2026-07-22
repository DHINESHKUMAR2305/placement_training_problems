					Divide a String Into Groups of Size k


class Solution 
{
    public String[] divideString(String s, int k, char fill) 
    {
        String temp = "";

        ArrayList<String> xx = new ArrayList<>();

        for(char c : s.toCharArray())
        {
            if(temp.length() == k)
            {
                xx.add(temp);
                temp = "";
            }

            temp+=c;
        } 

        if(!temp.isEmpty())
        {
            for(int i=0 ; i<k ; i++)
            {
                if(temp.length() == k)
                {
                    xx.add(temp);
                    break;
                }
                temp+=fill;
            }
        }   

        String[] res = new String[xx.size()];

        int res_count = 0;

        for(String ss : xx)
        {
            res[res_count++] = ss;
        }

        System.out.println(xx);

        return res;
        
    }
}