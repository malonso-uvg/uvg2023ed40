import java.util.Vector;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
public class StackUsingVector<T> extends AbstractStack<T> {

	private Vector<T> vectorInterno;
	
	public StackUsingVector() {
		vectorInterno = new Vector<T>();
		this.type = this.VECTOR_STACK;
	}
	
	@Override
	public int count() {
		return vectorInterno.size();
	}

	@Override
	public boolean isEmpty() {
		return vectorInterno.isEmpty();
	}

	@Override
	public void push(T value) {
		vectorInterno.add(value);
		
	}

	@Override
	public T pull() {
		return vectorInterno.remove(count() - 1);
	}

	@Override
	public T peek() {
		return vectorInterno.get(count() - 1);
	}

}
