import java.util.LinkedList;
public class linkedList {
    public static void main(String[] args) {

        LinkedList l1 = new LinkedList();
        l1.addFirst(10);
        l1.addFirst(20);
        l1.addFirst(30);
        l1.addFirst(40);
        l1.addFirst(50);

        Node temp = l1.head;
        while (temp != null) {
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
    }
}
