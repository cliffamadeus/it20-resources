package topic_1_arraylist_operations;
import java.util.ArrayList;

public class ItemManager {
	
	private ArrayList<String> items;

    // Constructor to initialize the ArrayList
    public ItemManager() {
        items = new ArrayList<>();
    }
    
    // Display
    public void displayItems() {
        System.out.println("Items in the list: " + items);
    }
    
    // Method to insert an item
    public void insertItem(String item) {
        items.add(item);
        System.out.println("Inserted: " + item);
    }
    
   
    
    

}
