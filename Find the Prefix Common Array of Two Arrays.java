						Find the Prefix Common Array of Two Arrays


class Solution 
{
    public int[] findThePrefixCommonArray(int[] A, int[] B) 
    {
        int[] res = new int[A.length];

        for(int i=0 ; i<A.length ; i++)
        {
            HashMap<Integer , Integer> hm = new HashMap<>();

            for(int j=0 ; j<=i ; j++)
            {
                hm.put(A[j] , hm.getOrDefault(A[j] , 0) +1);
                hm.put(B[j] , hm.getOrDefault(B[j] , 0) +1);
            }

            int count = 0;

            for(Map.Entry<Integer , Integer> xx : hm.entrySet())
            {
                if(xx.getValue()>1)
                {
                    count+=1;
                }
            }

            res[i] = count;
        }   

        return res;
    }
}