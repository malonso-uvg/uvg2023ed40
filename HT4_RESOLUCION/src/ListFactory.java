/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class ListFactory {
	
	public static AbstractList<String> getList(int listType){
		
		
		
		switch(listType){
		case 1:{ //Single Linked List
			return new SingleLinkedList<String>();
		}
		case 2:{
			return new DoubleLinkedList<String>();
		}
		
		default:{
			return new SingleLinkedList<String>();
		}
		}
	}

}
