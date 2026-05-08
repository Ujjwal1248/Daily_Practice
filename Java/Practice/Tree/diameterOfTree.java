package Tree;

import java.sql.SQLOutput;

public class diameterOfTree {
    static int height = 0;
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        diameter(root);
        System.out.println(height);
    }

    private static int diameter(createBinaryTree.Node root) {
        if(root == null) return 0;
        int left = diameter(root.left);
        int right = diameter(root.right);
        height = Math.max(height, left + right);
        return Math.max(left, right) + 1;
    }

}
