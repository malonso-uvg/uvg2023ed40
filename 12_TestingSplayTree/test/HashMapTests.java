import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import edu.uvg.ht9.ArbolHashMap;
import edu.uvg.ht9.IKeyGenerator;
import edu.uvg.ht9.ObtenerLlaveDesdePalabra;
import edu.uvg.ht9.Palabra;
import java.util.HashMap;

class HashMapTests {

	@Test
	void test() {
		IKeyGenerator<String, Palabra> miExtractor = new ObtenerLlaveDesdePalabra<String, Palabra>();
		ArbolHashMap<String, Palabra> miDiccionario = new ArbolHashMap<String, Palabra>(miExtractor);
		
		miDiccionario.add(new Palabra("house", "casa"));
		miDiccionario.add(new Palabra("window", "ventana"));
		miDiccionario.add(new Palabra("dog", "perro"));
		
		Palabra miBusqueda = miDiccionario.get(new Palabra("house", ""));
		
		assertEquals("house", miBusqueda.getEnglish());
		assertEquals("casa", miBusqueda.getSpanish());
		
	}
	

}
