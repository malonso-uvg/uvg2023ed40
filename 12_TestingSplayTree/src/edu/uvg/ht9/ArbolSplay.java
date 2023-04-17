/**
 * 
 */
package edu.uvg.ht9;

import java.util.Comparator;

import structure5.*;
/**
 * @author MAAG
 *
 */
public class ArbolSplay<T extends Comparable<T>> implements IEstructuraArbol<T> {

	private SplayTree<T> miInternalTree;
	
	public ArbolSplay() {
		miInternalTree = new SplayTree<T>();
	}
	
	public ArbolSplay(Comparator<T> comparador) {
		miInternalTree = new SplayTree<T>(comparador);
	}
	
	@Override
	public void add(T value) {
		miInternalTree.add(value);
		
	}

	@Override
	public T get(T key) {
		return miInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return miInternalTree.remove(key);
	}

	@Override
	public int count() {
		return miInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return miInternalTree.isEmpty();
	}
	
	public SplayTree<T> getInternalTree(){
		return miInternalTree;
	}

}
