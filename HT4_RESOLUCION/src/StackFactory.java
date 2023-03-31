/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class StackFactory<T> {

	public AbstractStack<T> getList(int stackType){
		
		switch(stackType){
		case 1:{ //Single Linked List
			return new StackUsingArrayList<T>();
		}
		case 2:{
			return new StackUsingVector<T>();
		}
		
		case 3:{ //Single Linked List
			return new StackUsingList<T>(1);
		}
		case 4:{
			return new StackUsingList<T>(2);
		}
		
		default:{
			return new StackUsingArrayList<T>();
		}
		}
	}
}
