/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class StackUsingList<T> extends AbstractStack<T> {

	AbstractList<T> miListaInterna;
	
	public StackUsingList(int listType) {
		miListaInterna = (new ListFactory<T>()).getList(listType);
		this.type = miListaInterna.getType();
	}
	
	@Override
	public int count() {
		return miListaInterna.Count();
	}

	@Override
	public boolean isEmpty() {
		return miListaInterna.IsEmpty();
	}

	@Override
	public void push(T value) {
		miListaInterna.InsertAtStart(value);
		
	}

	@Override
	public T pull() {
		return miListaInterna.DeleteAtStart();
	}

	@Override
	public T peek() {
		return miListaInterna.Get(0);
	}

}
