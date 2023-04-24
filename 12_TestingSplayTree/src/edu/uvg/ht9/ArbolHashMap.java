/**
 * 
 */
package edu.uvg.ht9;

import java.util.HashMap;

/**
 * @author moises.alonso
 *
 */
public class ArbolHashMap<K, T> implements IEstructuraArbol<T> {

	HashMap<K, T> miMapaInterno;
	IKeyGenerator<K, T> internalKeyCollector;
	
	public ArbolHashMap(IKeyGenerator<K, T> keyCollector) {
		miMapaInterno = new HashMap<K, T>();
		internalKeyCollector = keyCollector;
	}
	
	
	@Override
	public void add(T value) {
		K key = internalKeyCollector.getKey(value);
		miMapaInterno.put(key, value);
	}

	@Override
	public T get(T key) {
		K _key = internalKeyCollector.getKey(key);
		return miMapaInterno.get(_key);
	}

	@Override
	public T remove(T key) {
		K _key = internalKeyCollector.getKey(key);
		return miMapaInterno.remove(_key);
	}

	@Override
	public int count() {
		return miMapaInterno.size();
	}

	@Override
	public boolean isEmpty() {
		return miMapaInterno.isEmpty();
	}

}
