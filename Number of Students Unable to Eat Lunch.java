					Number of Students Unable to Eat Lunch


class Solution 
{
    public int countStudents(int[] students, int[] sandwiches) 
    {
        Stack<Integer> stack = new Stack<>();

        ArrayList<Integer> xx = new ArrayList<>();


        for(int i=sandwiches.length-1 ; i>=0 ; i--)
        {
            stack.push(sandwiches[i]);
        }

        for(int i : students)
        {
            xx.add(i);
        }

        int count = 0;

        boolean is_boolean = true;

        while(is_boolean)
        {
            int one = stack.peek();
            int two = xx.get(0);

            if(one == two)
            {
                stack.pop();
                xx.remove(0);
            }
            else 
            {
                xx.add(xx.get(0));
                xx.remove(0);
            }

            count++;

            if(count>290)
            {
                return stack.size();
            }

            if(stack.isEmpty())
            {
                is_boolean = false;
                return 0;
            }

        }



        return stack.size();

    }
}