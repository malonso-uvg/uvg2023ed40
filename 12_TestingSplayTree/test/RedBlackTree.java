import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.jupiter.api.Test;

import structure5.RedBlackSearchTree;
import edu.uvg.ht9.*;

/**
 * 
 */

/**
 * @author MAAG
 *
 */
class RedBlackTree {

	@Test
	void InsertionRedBlackTree() {
		RedBlackSearchTree<Palabra> miDiccionario = new RedBlackSearchTree<Palabra>();
		
		miDiccionario.add(new Palabra("dog", "perro"));
		miDiccionario.add(new Palabra("house", "casa"));
		miDiccionario.add(new Palabra("window", "ventana"));
		
		Palabra miBusqueda = miDiccionario.get(new Palabra("house", ""));
		
		assertEquals("house", miBusqueda.getEnglish());
		assertEquals("casa", miBusqueda.getSpanish());
				
		
		
	}

}
