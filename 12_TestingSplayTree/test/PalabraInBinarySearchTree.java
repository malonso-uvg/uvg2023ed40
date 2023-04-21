import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.uvg.ht9.ComparadorPalabras;
import edu.uvg.ht9.Palabra;
import edu.uvg.ht9.ArbolBinarioBusqueda;

class PalabraInBinarySearchTree {

	@Test
	void test() {
		ArbolBinarioBusqueda<Palabra> miDiccionario = new ArbolBinarioBusqueda<Palabra>(new ComparadorPalabras<Palabra>());
		
		miDiccionario.add(new Palabra("dog", "perro"));
		miDiccionario.add(new Palabra("house", "casa"));
		miDiccionario.add(new Palabra("window", "ventana"));
		
		
		Palabra mibusqueda = miDiccionario.get(new Palabra("house", ""));
		
		assertEquals("house", mibusqueda.getEnglish());
		assertEquals("casa", mibusqueda.getSpanish());

	}

}
