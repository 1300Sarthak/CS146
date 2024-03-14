package Labs.Lab5;

public class Lab5 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
        }

        public boolean isValidBST(TreeNode node, long lower, long upper) {
            if (node == null)
                return true;

            int val = node.val;
            if (val <= lower || val >= upper)
                return false;

            if (!isValidBST(node.right, val, upper))
                return false;
            if (!isValidBST(node.left, lower, val))
                return false;

            return true;
        }
    }

}
