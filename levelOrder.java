						levelOrder

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution 
{
    public List<List<Integer>> levelOrder(TreeNode root) 
    {
        List<List<Integer>> arr = new ArrayList<>();

        if(root == null)
        {
            return arr;
        }

        Queue<TreeNode> xx = new LinkedList<>();

        xx.add(root);

        while(!xx.isEmpty())
        {
            ArrayList<Integer> pp = new ArrayList<>();

            int size = xx.size();

            for(int i=0 ; i<size ; i++)
            {
                TreeNode temp = xx.poll();

                pp.add(temp.val);

                if(temp.left!=null)
                {
                    xx.add(temp.left);
                }

                if(temp.right!=null)
                {
                    xx.add(temp.right);
                }
            }

            arr.add(pp);
        }

        return arr;

    }
}