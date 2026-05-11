					Calculate Delayed Arrival Time

class Solution 
{
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) 
    {
        
        int add = arrivalTime + delayedTime;

        return add%24;

    }
}