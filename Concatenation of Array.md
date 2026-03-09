### 				**Concatenation of Array**









**class Solution** 

**{**

    **public int\[] getConcatenation(int\[] nums)** 

    **{**

        **int\[] res = new int\[nums.length + nums.length];**

        **int res\_count = 0;**



        **for(int i : nums)**

        **{**

            **res\[res\_count++] = i;**

        **}**    

        **for(int i : nums)**

        **{**

            **res\[res\_count++] = i;**

        **}**   



        **return res;**

    **}**

**}**

