package Tree;

public class deleteNodeBST {
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
    static void main(String[] args) {
        TreeNode root = null;
        int val = 5;
        TreeNode result = deleteNode(root, val);
    }
    public static TreeNode deleteNode(TreeNode root, int key) {
        if(root == null) return null;
        if(root.val == key) return helper(root);
        TreeNode dummy = root;
        while(root != null){
            if(key < root.val){
                if(root.left != null && root.left.val == key) {
                    root.left = helper(root.left);
                    break;
                }
                else root = root.left;
            }
            else{
                if(root.right != null && root.right.val == key) {
                    root.right = helper(root.right);
                    break;
                }
                else root = root.right;
            }
        }
        return dummy;
    }

    private static TreeNode helper(TreeNode root) {
        if(root.left == null) return root.right;
        else if(root.right == null) return root.left;
        TreeNode rigthCh = root.right;
        TreeNode lastRight = lastRight(root);
        lastRight.right = rigthCh;
        return root.left;
    }

    private static TreeNode lastRight(TreeNode root) {
        if(root.right == null) return root;
        return lastRight(root.right);
    }
}
