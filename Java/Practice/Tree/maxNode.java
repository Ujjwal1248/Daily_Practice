package Tree;

public class maxNode {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        max(root);
        System.out.println(mm);
    }
    public static int mm = Integer.MIN_VALUE;
    static void max(createBinaryTree.Node root) {
        if(root == null) return;
        if(root.val > mm) mm = root.val;
        max(root.left);
        max(root.right);
        return;
    }
}
