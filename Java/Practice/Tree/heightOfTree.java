package Tree;

public class heightOfTree {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        System.out.println(max(root));
    }

    static int max(createBinaryTree.Node root) {
//        if(root.left == null && root.right == null) return 0;
//        int lt = Integer.MIN_VALUE;
//        int rt = Integer.MIN_VALUE;
//        if(root.left != null) lt = max(root.left);
//        if(root.right != null) rt = max(root.right);
//        return Math.max(lt, rt) + 1;
        if(root == null) return -1;
        int lt = max(root.left);
        int rt = max(root.right);
        return Math.max(lt, rt) + 1;
    }

}
