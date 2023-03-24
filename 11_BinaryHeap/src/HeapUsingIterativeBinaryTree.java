import java.util.ArrayList;
import java.util.Comparator;

/**
 * 
 */

/**
 * @author moises.alonso
 *
 */
public class HeapUsingIterativeBinaryTree<P, V> implements IHeap<P, V> {

	private int _count;
	private TreeNode<P, V> _root;
	private Comparator<P> _priorityComparator;
	
	public HeapUsingIterativeBinaryTree(Comparator<P> priorityComparator) {
		_count = 0;
		_priorityComparator = priorityComparator;
	}
	
	@Override
	public void Insert(P priority, V value) {
		TreeNode<P, V> newNode = new TreeNode<P, V>(priority, value);
		
		if (count() == 0) { //Inserto en la raiz
			_count++;
			_root = newNode;
		} else {
			
			_count++;
			
			byte[] movimientos = convertToBinary(_count);
			
			//Reccorer de acuerdo a los movimientos
			int index = 1;
			TreeNode<P, V> actual = _root;
			
			while (index < movimientos.length) {
				
				if (index == movimientos.length - 1) {
					if (movimientos[index] == 0) { // Inserto en el hijo izquierdo
						actual.set_left(newNode);
					} else { //Inserto en el hijo derecho
						actual.set_right(newNode);
					}
					newNode.set_parent(actual);
				} else {
					if (movimientos[index] == 0) { // Inserto en el hijo izquierdo
						actual = actual.get_left();
					} else { //Inserto en el hijo derecho
						actual = actual.get_right();
					}
				}
				
				index++;
			}
			
			
			//Hacer Swap
			actual = newNode;
			while((actual != null) && (actual.get_parent() != null)) {
				Swap(actual);
				actual = actual.get_parent();
			}
			
		}
		
	}
	
	private byte[] convertToBinary(int value) {
		
		ArrayList<Byte> listBytes = new ArrayList<Byte>();
		
		while (value > 0) {
			listBytes.add( (byte)(value % 2) );
			value = value / 2;
		}
		//listBytes.add((byte) (value % 2) );
		
		byte[] binaryBytes = new byte[listBytes.size()]; 
		
		for (int i = listBytes.size() - 1; i >= 0; i-- ) {
			binaryBytes[listBytes.size() - 1 - i] = listBytes.get(i);  
		}
		
		return binaryBytes;
	}
	
	private void Swap(TreeNode<P, V> actualNode) {
		if (actualNode != null) {
			
			if (actualNode.get_parent() != null) { //is not the root
				
				int result = _priorityComparator.compare(actualNode.get_priority(), actualNode.get_parent().get_priority());
				
				if (result > 0) { //if child is greater than parent
					P tempP = actualNode.get_priority();
					V tempV = actualNode.get_value();
					
					actualNode.set_priority(actualNode.get_parent().get_priority());
					actualNode.set_value(actualNode.get_parent().get_value());
					
					actualNode.get_parent().set_priority(tempP);
					actualNode.get_parent().set_value(tempV);
				}
				
			}
			
		}
	}
	

	@Override
	public V get() {
		if (isEmpty())
			return null;
		else 
			return _root.get_value();
	}

	@Override
	public V remove() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		return _count;
	}

	@Override
	public boolean isEmpty() {
		return _count == 0;
	}

}
