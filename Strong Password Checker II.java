			Strong Password Checker II


class Solution 
{
    public boolean strongPasswordCheckerII(String password) 
    {
        if(password.length()<8)
        {
            return false;
        }
        boolean digit = false;
        boolean upper = false;
        boolean lower = false;
        boolean special = false;

        for(char c : password.toCharArray())
        {
            if(Character.isDigit(c))
            {
                digit = true;
            }
            else if(Character.isUpperCase(c))
            {
                upper = true;
            }
            else if(Character.isLowerCase(c))
            {
                lower = true;
            }
            else if(!Character.isDigit(c) && !Character.isLetter(c))
            {
                special = true;
            }
        }

        boolean issame = true;

        for(int i=0 ; i<password.length()-1 ; i++)
        {
            if(password.charAt(i) == password.charAt(i+1))
            {
                issame = false;
                break;
            }
        }

        if(digit && upper && lower && special && issame)
        {
            return true;
        }

        return false;

    }
}