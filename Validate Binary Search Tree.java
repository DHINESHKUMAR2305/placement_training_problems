						Validate Binary Search Tree


class Solution 
{
    ArrayList<Integer> xx = new ArrayList<>();

    public boolean isValidBST(TreeNode root) 
    {
        if(root == null)
        {
            return true;
        }

        isValidBST(root.left);
        xx.add(root.val);
        isValidBST(root.right);

        for(int i=0 ; i<xx.size()-1 ; i++)
        {
            if(xx.get(i) < xx.get(i+1))
            {
                continue;
            }
            else 
            {
                return false;
            }
        }
        
        return true;

    }
}