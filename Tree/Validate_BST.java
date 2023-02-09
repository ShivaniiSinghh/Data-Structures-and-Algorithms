package Tree;

public class Validate_BST {
class TreeNode {
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
class BST_Pair{
    boolean isBST = true;
    long min = Long.MAX_VALUE;
    long max = Long.MIN_VALUE;
}
    public boolean isValidBST(TreeNode root){
        return ValidBST(root).isBST;
    }
    public BST_Pair ValidBST(TreeNode root){
        if(root==null){
            return new BST_Pair();
        }
        BST_Pair lbp = ValidBST(root.left); //left BST Pair
        BST_Pair rbp = ValidBST(root.right); //right BST Pair
        BST_Pair sbp = new BST_Pair(); //self BST Pair
        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
        if(lbp.isBST && rbp.isBST && lbp.max<root.val && rbp.min>root.val){
            sbp.isBST=true;
        }
        else{

            sbp.isBST=false;
        }
        return sbp;
    }
}
