package Tree;


import java.util.LinkedList;
import java.util.Queue;

public class displayTree {
    public static int[] arr = {2,3,4,5,16,7,8,9};
    static void main(String[] args) {
        createBinaryTree.Node root = createBinaryTree.buildTree(arr);
        display(root);
    }

    public static void display(createBinaryTree.Node root) {
        Queue<createBinaryTree.Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            createBinaryTree.Node curr = q.poll();
            System.out.print(curr.val + " ");
            if(curr.left != null){
                q.add(curr.left);

            }
            if(curr.right != null){
                q.add(curr.right);
            }
        }
    }
}
