					String Compression


import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		//Input: "aaabbc"
		//Output: "a3b2c1"

		String a = "aabbaa";

		String res = "";

		for(int i=0 ; i<a.length() ; )
		{
			int count = 1;
			int j;
			for(j=i+1 ; j<a.length() ; j++)
			{
				if(a.charAt(i) == a.charAt(j))
				{
					count++;
				}
				else
				{
					break;
				}
			}
            res+=a.charAt(i);
            res+=String.valueOf(count);
            i = j;
		}

		System.out.println(res);


	}
}