/**
 * 
 */

/**
 * @author MAAG
 *
 */
public abstract class AbstractList<T> implements IList<T> {

	public static int SINGLE_LINKED_LIST = 1;
	public static int DOUBLE_LINKED_LIST  = 2;
	public static int VECTOR_STACK = 3;
	public static int ARRAYLIST_STACK = 4;
	public static int LIST_STACK = 5;
	
	protected int type;
	
	public int getType() {
		return type;
	}
	
	@Override
	public void InsertAtStart(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void InsertAtEnd(T value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Insert(T value, int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T Delete(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T DeleteAtStart() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T DeleteAtEnd() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public T Get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean IsEmpty() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int Count() {
		// TODO Auto-generated method stub
		return 0;
	}

}
