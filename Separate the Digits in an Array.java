				Separate the Digits in an Array

class Solution 
{
    public int[] separateDigits(int[] nums) 
    {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i  : nums)
        {
            int temp = i;

            int len = 0;

            int nneeww = 0;

            while(temp!=0)
            {
                int xx = temp%10;
                nneeww = nneeww*10+xx;
                len++;
                temp/=10;
            }

            while(nneeww!=0)
            {
                arr.add(nneeww%10);
                len--;
                nneeww/=10;
            }

            if(len!=0)
            {
                while(len!=0)
                {
                    arr.add(0);
                    len--;
                }
            }
        }
        
        int[] fin = new int[arr.size()];

        int fin_count = 0;

        for(int i : arr)
        {
            fin[fin_count++] = i;
        }

        return fin;

    }
}