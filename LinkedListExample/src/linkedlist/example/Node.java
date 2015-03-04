package linkedlist.example;

public class Node {
	int elem;
	Node next;
	Node prev;
	//Node first;
	public Node(int n) {
		this(n, null, null);
	}
	
	public Node(int n, Node prev, Node next) {
		this.elem = n;
		this.next = next;
		this.prev = prev;
	}
	
	public void print() {
		System.out.print(elem + " ");
	}
}