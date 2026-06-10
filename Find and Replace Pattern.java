							Find and Replace Pattern

class Solution 
{
    public List<String> findAndReplacePattern(String[] words, String pattern) 
    {
        ArrayList<String> oo = new ArrayList<>();

        for(String s : words)
        {
            String temp = s;

            boolean xx = true;
            
            if(temp.length() == pattern.length())
            {
                HashMap<Character , Character> hm = new HashMap<>();

                for(int i=0 ; i<temp.length() ; i++)
                {
                    if(!hm.containsKey(temp.charAt(i)))
                    {
                        if(hm.containsValue(pattern.charAt(i)))
                        {
                            xx = false;
                        }
                        else 
                        {
                            hm.put(temp.charAt(i) , pattern.charAt(i));
                        }
                    }
                    else 
                    {
                        if(hm.get(temp.charAt(i)) == pattern.charAt(i))
                        {
                            continue;
                        }
                        else 
                        {
                            xx = false;
                        }
                    }
                }

            }

            if(xx)
            {
                oo.add(temp);
            }

        }    

        return oo;
    }
}