package topic_2_linkedlist;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 20 from the list...");
        System.out.println("Current Linked List:");
        list.deleteByValue(20);
        list.printList();

	}

}
