package topic_2_linkedlist_string;

public class Main {

	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add("Rick Astley - Never Gonna Give You Up");
        list.add("Joe Lamont - Victims of Love");
        list.add("Cup of Joe, Janine - Tingin");
        list.add("Maki - Dilaw");
        System.out.println("Current Linked List:");
        list.printList();
        
        //Delete
        System.out.println();
        System.out.println("Deleting 20 from the list...");
        System.out.println("Current Linked List:");
        list.deleteByValue("Joe Lamont - Victims of Love");
        list.printList();
        
        //Move/Swap Pointer
        System.out.println();
        System.out.println("Moving/Swapping node from index 1 to index 0");
        list.moveNodePointer(0, 1);
        list.printList();
	}

}
