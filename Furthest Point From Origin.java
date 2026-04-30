				Furthest Point From Origin

class Solution 
{
    public int furthestDistanceFromOrigin(String moves) 
    {
        int left = 0;
        int right = 0;
        int line = 0;

        for(char c : moves.toCharArray())
        {
            if(c=='L')
            {
                left+=1;
            }
            else if(c=='R')
            {
                right+=1;
            }
            else 
            {
                line+=1;
            }
        }

        

        return Math.abs(left - right)+line;

    }
}