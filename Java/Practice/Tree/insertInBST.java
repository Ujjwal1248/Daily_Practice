package Tree;

public class insertInBST {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        int val = 5;
        displayTree.display(insert(root, val));
    }

    private static createBinaryTree.Node insert(createBinaryTree.Node root, int val) {
        if(root == null) return new createBinaryTree.Node(val);
        if(val < root.val) root.left = insert(root.left, val);
        else root.right = insert(root.right, val);
        return root;
    }
}
