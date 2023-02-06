package Tree;

public class Binary_Tree_Camera {
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

    int count=0;
    public int minCameraCover(TreeNode root){
        int c = CountCamera(root);
        if(c==-1){
            count++;
        }
        return count;
    }
    public int CountCamera(TreeNode root){
        if(root==null)
            return 1; // camera required
        int left = CountCamera(root.left);
        int right = CountCamera(root.right);
        if(left==-1 || right==-1){
            count++;
            return 2; //camera fit
        }
        if(left==1 && right==1){
            return -1; //camera not required, covered
        }
        else{
            return 1; //camera required
        }
    }
}
