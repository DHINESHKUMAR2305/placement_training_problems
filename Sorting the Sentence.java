					Sorting the Sentence

class Solution 
{
    public String sortSentence(String s) 
    {
        String[] arr = s.split(" ");

        String[] res = new String[arr.length];

        String[] sample = {"1" , "2" , "3" , "4" , "5" , "6" , "7" , "8" , "9"};

        for(int i=0 ; i<arr.length ; i++)
        {
            if(arr[i].contains("1"))
            {
                res[0] = arr[i];
            }
            else if(arr[i].contains("2"))
            {
                res[1] = arr[i];
            }
            else if(arr[i].contains("3"))
            {
                res[2] = arr[i];
            }
            else if(arr[i].contains("4"))
            {
                res[3] = arr[i];
            }
            else if(arr[i].contains("5"))
            {
                res[4] = arr[i];
            }
            else if(arr[i].contains("6"))
            {
                res[5] = arr[i];
            }
            else if(arr[i].contains("7"))
            {
                res[6] = arr[i];
            }
            else if(arr[i].contains("8"))
            {
                res[7] = arr[i];
            }
            else if(arr[i].contains("9"))
            {
                res[8] = arr[i];
            }
        }

        System.out.println(Arrays.toString(res));

        String fin = "";

        for(int i=0 ; i<res.length ; i++)
        {
            String temp = res[i];

            for(int j=0 ; j<temp.length() ; j++)
            {
                if(!Character.isDigit(temp.charAt(j)))
                {
                    fin+=temp.charAt(j);
                }
            }
            fin+=" ";
        }

        return fin.trim();

    }
}