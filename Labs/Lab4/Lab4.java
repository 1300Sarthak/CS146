package Labs.Lab4;

public class Lab4 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode invertTree(TreeNode root) {
        // check the base case
        if (root == null) {
            return null;
        }
        // invert right subtree
        TreeNode right = invertTree(root.right);
        // invert left subtree
        TreeNode left = invertTree(root.left);
        // swap left and right
        root.left = right;
        root.right = left;
        // return the root node
        return root;
    }

}
