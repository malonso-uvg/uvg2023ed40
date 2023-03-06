import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
class BinarySearchTreeTest {

	@Test
	void InsetAndInOrderTest() {
		CarnetComparator<Integer> comparadorCarnet = new CarnetComparator<Integer> ();
		ExtraerCarnetDeEstudiante<Integer, Estudiante> extractorCarnet = new ExtraerCarnetDeEstudiante<Integer, Estudiante>(); 
		
		BinarySearchTree<Integer, Estudiante> miArbolEstudiantes = new BinarySearchTree<Integer, Estudiante> (comparadorCarnet, extractorCarnet); 
		
		miArbolEstudiantes.add(new Estudiante(17, "Estudiante Prueba 1"));
		
		miArbolEstudiantes.add(new Estudiante(3, "Estudiante Prueba 2"));
		
		miArbolEstudiantes.add(new Estudiante(100, "Estudiante Prueba 3"));
		
		GuardarEstudianteEnArrayList<Integer, Estudiante> miRecorridoInorder = new GuardarEstudianteEnArrayList<Integer, Estudiante>(); 
		
		miArbolEstudiantes.InOrderTraversal(miRecorridoInorder);
		
		assertEquals(3, miRecorridoInorder.getMiListado().get(0).getCarnet());
		assertEquals(17, miRecorridoInorder.getMiListado().get(1).getCarnet());
		assertEquals(100, miRecorridoInorder.getMiListado().get(2).getCarnet());
		
		
		GuardarEstudianteEnArrayList<Integer, Estudiante> miRecorridoPostOrder = new GuardarEstudianteEnArrayList<Integer, Estudiante>();
		miArbolEstudiantes.PostOrderTraversal(miRecorridoPostOrder);
		
		assertEquals(3, miRecorridoPostOrder.getMiListado().get(0).getCarnet());
		assertEquals(100, miRecorridoPostOrder.getMiListado().get(1).getCarnet());
		assertEquals(17, miRecorridoPostOrder.getMiListado().get(2).getCarnet());
		
	}

}
