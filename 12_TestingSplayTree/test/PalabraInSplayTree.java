import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import structure5.Palabra;
import structure5.SplayTree;

class PalabraInSplayTree {

	@Test
	void test() {
		SplayTree<Palabra> miDiccionario = new SplayTree<Palabra>();
		
		miDiccionario.add(new Palabra("dog", "perro"));
		Palabra casa = new Palabra("house", "casa"); 
		miDiccionario.add(casa);
		miDiccionario.add(new Palabra("window", "ventana"));
		
		
		miDiccionario.get(casa);
		miDiccionario.get(casa);
	}

}
