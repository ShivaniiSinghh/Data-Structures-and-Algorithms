//package Tree;
//
//public class Max_Sum_BST {
//    class TreeNode {
//        int val;
//        Insert_into_BST.TreeNode left;
//        Insert_into_BST.TreeNode right;
//
//        TreeNode() {
//        }
//
//        TreeNode(int val) {
//            this.val = val;
//        }
//
//        TreeNode(int val, Insert_into_BST.TreeNode left, Insert_into_BST.TreeNode right) {
//            this.val = val;
//            this.left = left;
//            this.right = right;
//        }
//    }
//
//    class BST_Pair {
//        boolean isBST = true;
//        long min = Long.MAX_VALUE;
//        long max = Long.MIN_VALUE;
//        int sum=0;//bt
//    }
//    public BST_Pair ValidBST(Validate_BST.TreeNode root){
//        if(root==null){
//            return new BST_Pair();
//        }
//        BST_Pair lbp = ValidBST(root.left); //left BST Pair
//        BST_Pair rbp = ValidBST(root.right); //right BST Pair
//        BST_Pair sbp = new BST_Pair(); //self BST Pair
//        sbp.max = Math.max(lbp.max,Math.max(rbp.max,root.val));
//        sbp.min = Math.min(lbp.min,Math.min(rbp.min,root.val));
//        if(lbp.isBST && rbp.isBST && lbp.max<root.val && rbp.min>root.val){
//            sbp.isBST=true;
//        }
//        else{
//
//            sbp.isBST=false;
//        }
//        return sbp;
//    }
//    class Solution {
//        public int maxSumBST(TreeNode root) {
//
//        }
//    }
//}