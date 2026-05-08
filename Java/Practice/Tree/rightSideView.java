package Tree;

import java.util.ArrayList;
import java.util.List;

public class rightSideView {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        rightView(root);
    }
    public static List<Integer> ll = new ArrayList<>();
    public static void rightView(createBinaryTree.Node root) {
        helper(root, 0);
        for(int i : ll) {
            System.out.println(i + " ");
        }
    }
    public static int maxH = 0;
    static void helper(createBinaryTree.Node root, int currH) {
        if(root == null) return;
        if(currH > maxH) {
            ll.add(root.val);
            maxH = currH;
        }
        helper(root.right, currH + 1);
        helper(root.left, currH + 1);
    }
}
