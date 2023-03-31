import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
class ListTests {

	@Test
	void listFactoryTest() {
		AbstractList<String> miLista = ListFactory.getList(1);	
		assertEquals(miLista.SINGLE_LINKED_LIST, miLista.getType());
		
		AbstractList<String> miListaDouble = ListFactory.getList(2);	
		assertEquals(miListaDouble.DOUBLE_LINKED_LIST, miListaDouble.getType());
	}
	
	@Test
	void DoubleLinkedList_InsertAtStartAndGettest() {
		DoubleLinkedList<String> miLista = new DoubleLinkedList<String>();
		assertEquals(miLista.DOUBLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.InsertAtStart("primero");
		miLista.InsertAtStart("segundo");
		
		assertEquals("segundo", miLista.Get(0));
		assertEquals("primero", miLista.Get(1));
	}
	
	@Test
	void DoubleLinkedList_InsertAtEndAndGettest() {
		DoubleLinkedList<String> miLista = new DoubleLinkedList<String>();
		assertEquals(miLista.DOUBLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.InsertAtEnd("primero");
		miLista.InsertAtEnd("segundo");
		
		assertEquals("primero", miLista.Get(0));
		assertEquals("segundo", miLista.Get(1));
	}
	
	@Test
	void DoubleLinkedList_InsertAndGettest() {
		DoubleLinkedList<String> miLista = new DoubleLinkedList<String>();
		assertEquals(miLista.DOUBLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.Insert("primero", 0);
		miLista.Insert("segundo", 1);
		miLista.Insert("tercero", 1);
		
		assertEquals("primero", miLista.Get(0));
		assertEquals("segundo", miLista.Get(2));
		assertEquals("tercero", miLista.Get(1));
	}
	
	
	@Test
	void SingleLinkedList_InsertAtStartAndGettest() {
		SingleLinkedList<String> miLista = new SingleLinkedList<String>();
		assertEquals(miLista.SINGLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.InsertAtStart("primero");
		miLista.InsertAtStart("segundo");
		
		assertEquals("segundo", miLista.Get(0));
		assertEquals("primero", miLista.Get(1));
	}
	
	@Test
	void SingleLinkedList_InsertAtEndAndGettest() {
		SingleLinkedList<String> miLista = new SingleLinkedList<String>();
		assertEquals(miLista.SINGLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.InsertAtEnd("primero");
		miLista.InsertAtEnd("segundo");
		
		assertEquals("primero", miLista.Get(0));
		assertEquals("segundo", miLista.Get(1));
	}
	
	@Test
	void SingleLinkedList_InsertAndGettest() {
		SingleLinkedList<String> miLista = new SingleLinkedList<String>();
		assertEquals(miLista.SINGLE_LINKED_LIST, miLista.getType()); //Verifico que sea una lista simplemente encadenada
		
		miLista.Insert("primero", 0);
		miLista.Insert("segundo", 1);
		miLista.Insert("tercero", 1);
		
		assertEquals("primero", miLista.Get(0));
		assertEquals("segundo", miLista.Get(2));
		assertEquals("tercero", miLista.Get(1));
	}

}
