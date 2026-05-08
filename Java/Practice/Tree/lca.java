package Tree;

public class lca {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        createBinaryTree.Node p = null, q = null;
        createBinaryTree.Node result = helper(root, p, q);
    }

    static createBinaryTree.Node helper(createBinaryTree.Node root, createBinaryTree.Node p, createBinaryTree.Node q) {
        if(root == null) return null;
        if(root == p || root == q) return root;
        createBinaryTree.Node left = helper(root.left, p, q);
        createBinaryTree.Node right = helper(root.right, p, q);
        if(left != null && right != null) return root;
        if(left == null) return right;
        else return left;

    }
}
