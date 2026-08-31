						Sort Vowels in a String


class Solution 
{
    public String sortVowels(String s) 
    {
        ArrayList<Integer> xx = new ArrayList<>();

        for(char c : s.toCharArray())
        {
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' ||
            c == 'U' || c == 'O' || c == 'I' || c == 'E' )
            {

                int temp = (int) c;
                xx.add(temp);
            }
        }    

        Collections.sort(xx);
        int get_index = 0;

        String res = "";

        for(char c : s.toCharArray())
        {
            if(c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u' && c != 'A' &&
            c != 'U' && c != 'O' && c != 'I' && c != 'E' )
            {
                res+=c;
            }
            else 
            {
                int oo = xx.get(get_index);
                char cc = (char)(oo);
                res+=cc;
                get_index+=1;
            }
        }

        System.out.println(xx);

        return res;


    }
}