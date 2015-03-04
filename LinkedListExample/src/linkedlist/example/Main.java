package linkedlist.example;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node(5));
		list.add(new Node(10));
		list.add(new Node(8));
		list.add(new Node(15));
		list.add(new Node(9));
		list.add(new Node(2));

		list.printList();
		
	}

}
