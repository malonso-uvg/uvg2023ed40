import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.uvg.ht9.*;
import structure5.SplayTree;

class PalabraInSplayTree {

	@Test
	void test() {
		SplayTree<Palabra> miDiccionario = new SplayTree<Palabra>(new ComparadorPalabras<Palabra>());
		
		miDiccionario.add(new Palabra("dog", "perro"));
		miDiccionario.add(new Palabra("house", "casa"));
		miDiccionario.add(new Palabra("window", "ventana"));
		
		
		Palabra mibusqueda = miDiccionario.get(new Palabra("house", ""));
		
		assertEquals("house", mibusqueda.getEnglish());
		assertEquals("casa", mibusqueda.getSpanish());
		
	}

}
