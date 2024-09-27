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

	  public void showProfiles() {
	        Node current = head;
	        if (current == null) {
	            System.out.println("No profiles available.");
	            return;
	        }
	        System.out.println("Profiles:");
	        while (current != null) {
	            System.out.println(current.data);
	            current = current.next;
	        }
	  }
}
