					Reverse Degree of a String in c++



class Solution 
{
public:
    int reverseDegree(string s) 
    {
        string arr[] = {"a" , "b" , "c" , "d" , "e" , "f" , "g" , "h" , "i" , "j" , "k" , "l" , "m" , "n" , "o" , "p",
        "q" , "r" , "s" , "t" , "u" , "v" , "w" , "x" , "y" , "z"};

        
        int res = 0;

        int size = sizeof(arr)/sizeof(arr[0]);

            for(int j=0 ; j<s.length() ; j++)
            {
                for(int i=0 ; i<size ; i++)
                {
                    string temp = "";
                    temp+=s[j];
                    if(temp == arr[i])
                    {
                        int temp = abs(26-i);
                        temp = temp*(j+1);
                        cout << temp << endl;
                        res+=temp;

                    }
                }
            }

            return res;
        

    }
};