
					Find Closest Person

class Solution 
{
    public int findClosest(int x, int y, int z) 
    {
        int one = Math.abs(x - z);  
        int two = Math.abs(y - z) ;

        if(one == two)
        {
            return 0;
        }

        if(one < two)
        {
            return 1;
        }

        return 2;

    }
}