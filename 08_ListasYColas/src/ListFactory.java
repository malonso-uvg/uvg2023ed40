/**
 * 
 */
import structure5.AbstractList;
import structure5.SinglyLinkedList;
import structure5.DoublyLinkedList;

/**
 * @author moises.alonso
 *
 */
public class ListFactory<T> {
	
	/***
	 * This method create an instance of a List, base on user selection
	 * @param type type = single: Single Linked List, double: double linked List;
	 */
	public AbstractList<T> getInstance(String type) {
		
		AbstractList<T> listInstance;
		
		switch (type.toLowerCase()) {
		case "single":{
			listInstance = new SinglyLinkedList<T>();
		}break;
		
		case "double":{
			listInstance = new DoublyLinkedList<T>();
		}break;
		
		default:{
			listInstance = null;
		}
		}
		
		return listInstance;
	}

}
