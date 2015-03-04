package linkedlist.example;

public class LinkedList {

	Node header;
	//Node tailer;
	
	public LinkedList() {
		header = new Node(-1);
		//tailer = new Node(-1, header, null);
	}
	
	public void add(Node n) {
		if(header.elem == -1) {
			header = n;
			//tailer.prev = n;
			return;
		}
		if(n == null) {
			return;
		}
		if(n.elem < header.elem) {
			n.next = header;
			header.prev = n;
			header = n;//iffy
		}
		else {
			Node dummy = header.next;
			Node dummyprev = header;
			//dummy.next = header.next;
			//dummyprev.prev = header;
			
			 while(dummy != null) {
				if(n.elem < dummy.elem) 
				{
					dummyprev.next = n;
					dummy.prev = n;
					n.prev = dummyprev;
					n.next = dummy;
					return;
				}
				dummy = dummy.next;
				dummyprev = dummyprev.next;
			}
			dummyprev.next = n;
			n.prev = dummyprev;
			
		}
	}
	
	public void printList() {
		Node n = new Node(-1);
		n.next = header;
		while(n.next != null) {
			n.next.print();
			n.next = n.next.next;
		}
	}
	

}
