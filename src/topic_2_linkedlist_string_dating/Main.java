package topic_2_linkedlist_string_dating;

public class Main {

	public static void main(String[] args) {
		
		 LinkedList list = new LinkedList();

	        // Adding some sample data
	        list.add("Katelyn");
	        list.add("Kent");
	        list.add("Ryan");
	        list.add("Kent Ryan");

	        // Start swiping
	        list.startSwipe();

	        // Simulating swipes
	        System.out.println("Swiping right:");
	        list.swipeRight(); // Move to Bob
	        list.printList();  // Print current list
	        System.out.println();
	        
	        System.out.println("Swiping left on Bob:");
	        list.swipeLeft();  // Remove Bob
	        list.printList();  // Print updated list
	        System.out.println();
	        
	        System.out.println("Swiping right:");
	        list.swipeRight(); // Move to Charlie
	        list.printList();  // Print current list
	        System.out.println();
	        
	        System.out.println("Swiping left on Charlie:");
	        list.swipeLeft();  // Remove Charlie
	        list.printList();  // Print updated list
	}

}
