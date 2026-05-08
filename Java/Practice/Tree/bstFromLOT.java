package Tree;

public class bstFromLOT {
    static void main(String[] args) {
        int[] arr = {7, 4, 12, 3, 6, 8, 1, 5, 10};
        createBinaryTree.Node root = null;
        for (int j : arr) {
            root = createBST(j, root);
        }
        displayTree.display(root);
    }

    private static createBinaryTree.Node createBST(int val, createBinaryTree.Node root) {
        if(root == null) return new createBinaryTree.Node(val);
        if(val < root.val) root.left = createBST(val, root.left);
        else root.right = createBST(val, root.right);
        return root;
    }
}