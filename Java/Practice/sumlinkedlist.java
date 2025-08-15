import java.util.*;

class SumLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Node head1 = createlinkedlist(sc, n);
        // Node head2 = createlinkedlist(sc, m); // Optional

        while (head1 != null) {
            System.out.print(head1.data + " => ");
            head1 = head1.next;
        }
    }

    static Node createlinkedlist(Scanner sc, int size) {
        Node head = null;
        Node tail = null;

        for (int i = 0; i < size; i++) {
            int data = sc.nextInt();
            Node newnode = new Node(data);

            if (head == null) {
                head = newnode;
                tail = newnode;
            } else {
                tail.next = newnode;
                tail = newnode;
            }
        }

        return head;
    }
}
