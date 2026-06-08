class Solution 
{
    public String[] findWords(String[] words) 
    {
        ArrayList<String> one = new ArrayList<>();
        one.add("q");
        one.add("w");
        one.add("e");
        one.add("r");
        one.add("t");
        one.add("y");
        one.add("u");
        one.add("i");
        one.add("o");
        one.add("p");


        ArrayList<String> two = new ArrayList<>();
        two.add("a");
        two.add("s");
        two.add("d");
        two.add("f");
        two.add("g");
        two.add("h");
        two.add("j");
        two.add("k");
        two.add("l");

        ArrayList<String> three = new ArrayList<>();
        three.add("z");
        three.add("x");
        three.add("c");
        three.add("v");
        three.add("b");
        three.add("n");
        three.add("m");

        ArrayList<String> res = new ArrayList<>();


        for(String s : words)
        {
            String temp = s;

            String xxx = temp;
            temp = temp.toLowerCase();

            int one_count = 0;
            int two_count = 0;
            int three_count = 0;

            for(char c : temp.toCharArray())
            {
                String temp2 = c+"";

                if(one.contains(temp2))
                {
                    one_count+=1;
                }
                else if(two.contains(temp2))
                {
                    two_count+=1;
                }
                else 
                {
                    three_count+=1;
                }

            }

            if(temp.length() == one_count)
            {
                res.add(xxx);
            }
            else if(temp.length() == two_count)
            {
                res.add(xxx);

            }
            else if(temp.length() == three_count)
            {
                res.add(xxx);
            }


        }

        String[] fin = new String[res.size()];
        int fin_count = 0;

        for(String s : res)
        {
            fin[fin_count++] = s;
        }

        return fin;

    }
}