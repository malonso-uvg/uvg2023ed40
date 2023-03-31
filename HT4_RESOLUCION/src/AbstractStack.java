/**
 * 
 */

/**
 * @author MAAG
 *
 */
public abstract class AbstractStack<T> implements IStack<T> {

	public static int DOUBLE_LINKED_LIST_STACK = 1;
	public static int SINGLE_LINKED_LIST_STACK = 2;
	public static int VECTOR_STACK = 3;
	public static int ARRAYLIST_STACK = 4;
	
	protected int type;
	
	public int getType() {
		return type;
	}
}
