import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IterativeHeapTest {

	@Test
	void test() {
		HeapUsingIterativeBinaryTree<Integer, String> myHeap = new HeapUsingIterativeBinaryTree<Integer, String>(new ComparadorNumeros<Integer>());
		myHeap.Insert(20, "");
		myHeap.Insert(10, "");
		myHeap.Insert(15, "");
		myHeap.Insert(5, "");
		myHeap.Insert(10, "");
	}

}
