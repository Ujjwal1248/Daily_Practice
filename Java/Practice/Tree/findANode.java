package Tree;

public class findANode {
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(displayTree.arr);
        System.out.println(search(root, 40));
    }

    static boolean search(createBinaryTree.Node root, int target) {
        if(root == null) return false;
        if(root.val == target) return true;
        boolean first = search(root.left, target);
        boolean second = search(root.right, target);
        return first || second;
    }
}
