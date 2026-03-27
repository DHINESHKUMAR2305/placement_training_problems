			Evaluate Reverse Polish Notation

class Solution 
{
    public int evalRPN(String[] arr) 
    {
        Stack<Integer> s = new Stack<>();

        for(String ss : arr)
        {
            if(ss.equals("+"))
            {
                int a = s.pop();
                int b = s.pop();

                int c = a+b;
                s.add(c);
            }
            else if(ss.equals("-"))
            {
                int a = s.pop();
                int b = s.pop();

                int c = b-a;

                s.add(c);
            }
            else if(ss.equals("*"))
            {
                int a = s.pop();
                int b = s.pop();

                int c = a*b;

                s.add(c);
            }
            else if(ss.equals("/"))
            {
                int a = s.pop();
                int b = s.pop();

                int c = b/a;

                s.add(c);
            }
            else 
            {
                s.add(Integer.parseInt(ss));
            }
        }    

        return s.pop();
    }
}