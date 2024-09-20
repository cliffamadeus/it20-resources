package topic_1_arraylist_operations;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ItemManager manager = new ItemManager();

	     manager.insertItem("IT20");
	     manager.insertItem("Data Structures and Algorithms");
	     
	     manager.displayItems();
	     
	     System.out.println();
	     manager.updateItem(0, "IT21");
	     manager.updateItem(1, "Object Oriented Programming");
	     
	     manager.displayItems();


	}

}
