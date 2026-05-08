package Tree;

public class validateBST {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        if(root.right == null && root.left == null) System.out.println(true);
        System.out.println(validate(root, Long.MIN_VALUE, Long.MAX_VALUE));
    }

    private static boolean validate(createBinaryTree.Node root, long min, long max) {
        if(root == null) return true;
        if(root.val < min || root.val > max) return false;
        boolean left = validate(root.left, min, root.val);
        boolean right= validate(root.right, root.val, max);
        return left && right;
    }
}
