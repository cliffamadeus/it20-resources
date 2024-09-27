package topic_2_linkedlist_dating;

public class LinkedList {
	  private Node head;
	  private Node tail;

	  public void add(String data) {
	      Node newNode = new Node(data);
	        if (head == null) {
	            head = newNode;
	            tail = newNode;
	        } else {
	            tail.next = newNode;
	            tail = newNode;
	        }
	   }

	 
}
