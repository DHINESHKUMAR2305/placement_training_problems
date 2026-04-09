					Convert Date to Binary


class Solution 
{
    public String convertDateToBinary(String date) 
    {
        String[] arr = date.split("-");

        String res = "";

        for(String s : arr)
        {
            int temp = Integer.parseInt(s);

            String xx = Integer.toBinaryString(temp);
            res+=xx+"-";
        }

        String fin = "";

        for(int i=0 ; i<res.length()-1 ; i++)
        {
            fin+=res.charAt(i);
        }

        return fin;


    }
}