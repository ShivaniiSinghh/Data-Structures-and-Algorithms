package Tree;

public class BST {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    public BST(int [] in){
        this.root = CreateTree(in,0,in.length-1);
    }
    private Node CreateTree(int[] in, int si, int ei){
        int mid=(si+ei)/2;
        if(si>ei){
            return null;
        }
        Node nn = new Node();
        nn.val = in[mid];
        nn.left=CreateTree(in,si,mid-1);
        nn.right = CreateTree(in,mid+1,ei);
        return nn;
    }
    public void PreOrder() {
        PreOrder(root);
        System.out.println();
    }
    private void PreOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.val + " ");
        PreOrder(node.left);
        PreOrder(node.right);
    }
    public static void main(String[] args) {
        int [] in = {10,20,30,40,50,60,70,80,90};
        BST bst = new BST(in);
        bst.PreOrder();
    }
}
