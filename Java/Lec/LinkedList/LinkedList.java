package Lec.LinkedList;

public class LinkedList {
    private class Node {
        int val;
        Node next;
        
        Node(int val) {
            this.val = val;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int item) {
        Node nn = new Node(item);
        if (size == 0) {
            head = tail = nn;
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            temp = temp.next;
            if (temp != null) {
                System.out.print(" => ");
            }
        }
        System.out.println();
    }

	public void addLast(int item) {
		if (size == 0) {
			addFirst(item);
		}
		else{
			Node nn = new Node();
			nn.val = item;
			tail.next = nn;
			tail = nn;
			size++;
		}
	}

	public Node GetNode(int k){
		if(k<0 || k>=size){
			return null;
		}
		Node temp = head;
		for(int i=0; i<k; i++){
			temp = temp.next;
		}
		return temp;
	}

	public void addAtIndex(int item, int k){
		if(k == 0){
			addFirst(item);
		}
		else if(k == size){
			addLast(item);
		}
		else{
			Node nn = new Node();
			nn.val = item;
			Node nm1 = GetNode(k-1);
			Node np1 = nm1.next;
			nm1.next = nn;
			nn.next = np1;
			size++;
		}
	}

	public int getFirst(){
		return head.val;
	}

	public int getLast(){
		return tail.val;
	}

	public int getAtIndex(int k) throws Exception{
		return GetNode(k).val;
	}
	public int removeFirst(){
		int val = head.val;
		if(size == 1){
			head =null;
			tail = null;
			size = 0;
		}
		else{
			Node temp = head;
			head = head.next;
			temp.next = null;
			size--;
		}
		return val;
	}
	public int removeLast() throws Exception{
		if(size == 1){
			removeFirst();
		}
		else{
			int val = tail.val;
			Node sl = GetNode(size-2);
			tail = sl;
			tail.next = null;
			size--;
			return val;
		}
	}
	
	public int remove_at_index(int k){
		if(k == 0){
			return removeFirst();
		}
		else if(k == size-1){
			return removeLast();
		}
		else{
			Node nm1 = GetNode(k-1);
			Node n = nm1.next;
			Node np1 = n.next;
			nm1.next = np1;
			n.next = null;
			size--;
			return n.val;
		}
	}

}
