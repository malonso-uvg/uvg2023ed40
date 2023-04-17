/**
 * 
 */
package edu.uvg.ht9;

import structure5.RedBlackSearchTree;
/**
 * @author MAAG
 *
 */
public class ArbolRedBlack<T extends Comparable<T>> implements IEstructuraArbol<T> {

	private RedBlackSearchTree<T> myInternalTree;
	
	public ArbolRedBlack() {
		myInternalTree = new RedBlackSearchTree<T>();
	}
	
	@Override
	public void add(T value) {
		myInternalTree.add(value);
	}

	@Override
	public T get(T key) {
		return myInternalTree.get(key);
	}

	@Override
	public T remove(T key) {
		return myInternalTree.remove(key);
	}

	@Override
	public int count() {
		return myInternalTree.size();
	}

	@Override
	public boolean isEmpty() {
		return myInternalTree.isEmpty();
	}
	
	public RedBlackSearchTree<T> getInternalTree(){
		return myInternalTree;
	}

}
