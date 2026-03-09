### 					**Contains Duplicate**







**class Solution** 

**{**

    **public boolean hasDuplicate(int\[] arr)** 

    **{**   

        **for(int i=0 ; i<arr.length ; i++)**

        **{**

            **for(int j=0 ; j<arr.length ; j++)**

            **{**

                **if(i==j)**

                **{**

                    **continue;**

                **}**

                **else if(arr\[i] == arr\[j])**

                **{**

                    **return true;**

                **}**

            **}**

        **}**

        **return false;**

    **}**

**}**

