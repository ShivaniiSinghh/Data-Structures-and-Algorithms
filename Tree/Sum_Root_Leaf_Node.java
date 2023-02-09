package Tree;

import javax.swing.tree.TreeNode;

public class Sum_Root_Leaf_Node {
public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
 }

    public int sumNumbers(TreeNode root) {
        return Sum(root,0);
    }

    public int Sum(TreeNode root, int ans) {
        if (root == null) {

        }
        if (root.left == null && root.right == null) {
            return ans * 10 + root.val;
        }
        int left = Sum(root.left, ans * 10 + root.val);
        int right = Sum(root.right, ans * 10 + root.val);
        return left + right;
    }
}
