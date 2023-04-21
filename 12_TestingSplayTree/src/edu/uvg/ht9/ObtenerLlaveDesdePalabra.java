/**
 * 
 */
package edu.uvg.ht9;

/**
 * @author moises.alonso
 *
 */
public class ObtenerLlaveDesdePalabra<String, T> implements IKeyGenerator<String, T> {

	@Override
	public String getKey(T value) {
		Palabra miPalabra = (Palabra)value;
		return (String) miPalabra.getEnglish();
	}

}
