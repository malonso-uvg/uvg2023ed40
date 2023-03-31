/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class ListFactory<T> {
	
	public AbstractList<T> getList(int listType){
		
		
		
		switch(listType){
		case 1:{ //Single Linked List
			return new SingleLinkedList<T>();
		}
		case 2:{
			return new DoubleLinkedList<T>();
		}
		
		default:{
			return new SingleLinkedList<T>();
		}
		}
	}

}
