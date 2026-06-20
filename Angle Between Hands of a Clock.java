					Angle Between Hands of a Clock


class Solution 
{
    public double angleClock(int hour, int minutes) 
    {
        double hr = (hour*30)+(minutes*0.5);

        int min = minutes*6;

        double minn = Math.abs(hr - min);

        return Math.min(360-minn , minn);

    }
}