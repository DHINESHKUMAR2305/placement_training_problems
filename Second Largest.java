					Second Largest




import java.util.*;
class Solution 
{
    public int getSecondLargest(int[] arr) 
    {
        HashSet<Integer> xx = new HashSet<>();
        
        for(int i : arr)
        {
            xx.add(i);
        }
        
        ArrayList<Integer> res = new ArrayList<>();
        
        
        
        for(int i : xx)
        {
            res.add(i);
        }
        
        Collections.sort(res);
        
        if(res.size() ==1)
        {
            return -1;
        }
        
        return res.get(res.size()-2);
    }
}