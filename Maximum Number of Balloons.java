					Maximum Number of Balloons

class Solution 
{
    public int maxNumberOfBalloons(String text) 
    {
        int b = 0;
        int a = 0;
        int l = 0;
        int o = 0;
        int n = 0;

        for(char c : text.toCharArray())
        {
            if(c == 'b')
            {
                b+=1;
            }
            else if(c == 'a')
            {
                a+=1;
            }
            else if(c == 'l')
            {
                l+=1;
            }
            else if(c == 'o')
            {
                o+=1;
            }
            else if(c=='n')
            {
                n+=1;
            }
        }
        l/=2;
        o/=2;

        ArrayList<Integer> xx = new ArrayList<>();

        xx.add(b);
        xx.add(a);
        xx.add(l);
        xx.add(o);
        xx.add(n);

        Collections.sort(xx);

        System.out.println(xx);

        return xx.get(0);

    }
}