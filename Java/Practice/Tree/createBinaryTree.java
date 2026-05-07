package Tree;

import java.util.*;

public class createBinaryTree {
    public static class Node{
        Node left, right;
        int val;
        Node(int val){
            this.val = val;
        }
    }
    public static void main(String[] args) {
        System.out.println("Start small. Ship something.");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of elements
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Node root = buildTree(arr);

        // print inorder to verify
        inorder(root);
    }
    public static Node buildTree(int[] arr) {
        Queue<Node> q = new LinkedList<>();
        Node root = new Node(arr[0]);
        q.add(root);
        int i = 1;
        while(!q.isEmpty() && i < arr.length){
            Node curr = q.poll();
            if(i < arr.length && arr[i] != -1){
                // q.add(arr[i]);
                curr.left = new Node(arr[i]);
                q.add(curr.left);
            }
            i++;
            if(i < arr.length && arr[i] != -1){
                // q.add(arr[i]);
                curr.right = new Node(arr[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root == null) return;
        inorder(root.left);
        System.out.print(root.val + " ");
        inorder(root.right);
    }
}
