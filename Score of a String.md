### 					**Score of a String**









class Solution 

{

&nbsp;   public int scoreOfString(String s) 

&nbsp;   {

&nbsp;       ArrayList<Integer> arr = new ArrayList<>();



&nbsp;       for(char c : s.toCharArray())

&nbsp;       {

&nbsp;           int temp = (int) c;

&nbsp;           arr.add(temp);

&nbsp;       }



&nbsp;       int sum = 0;

&nbsp;       for(int i=0 ; i<arr.size()-1 ; i++)

&nbsp;       {

&nbsp;           int temp = Math.abs(arr.get(i) - arr.get(i+1));

&nbsp;           sum+=temp;

&nbsp;       }



&nbsp;       return sum;



&nbsp;   }

}

