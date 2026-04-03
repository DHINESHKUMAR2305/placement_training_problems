 							wateringPlants

class Solution 
{
    public int wateringPlants(int[] arr, int capacity) 
    {
        int dummy = capacity;
        int count = 0;
        for(int i=0 ; i<arr.length ; i++)
        {
            if(dummy>=arr[i])
            {
                dummy-=arr[i];
                count = count+1;
            }
            else 
            {
                count = count+(2*i);
                dummy = capacity;
                count = count+1;
                dummy -= arr[i];
            }
        }    
        return count;
    }
}