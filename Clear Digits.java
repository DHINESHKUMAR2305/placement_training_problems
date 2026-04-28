					Clear Digits

class Solution 
{
    public String clearDigits(String s) 
    {
        Stack<Character> arr = new Stack<>();

        for(char c : s.toCharArray())
        {
            if(!Character.isDigit(c))
            {
                arr.push(c);
            }
            else 
            {
                arr.pop();
            }
        }

        String res = "";

        while(!arr.isEmpty())
        {
            res+=arr.peek();
            arr.pop();
        }

        String fin = "";

        for(int i=res.length()-1 ; i>=0 ; i--)
        {
            fin+=res.charAt(i);
        }

        System.out.println(res);

        return fin;

    }
}