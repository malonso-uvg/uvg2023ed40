package edu.uvg.ht9;

import java.util.Comparator;

import structure5.BinarySearchTree;

public class ArbolBinarioBusqueda<T extends Comparable<T>> implements IEstructuraArbol<T> {

	BinarySearchTree<T> miInternalTree;
	
	public ArbolBinarioBusqueda() {
		miInternalTree = new BinarySearchTree<T>();
	}
	
	public ArbolBinarioBusqueda(Comparator<T> comparador) {
		miInternalTree = new BinarySearchTree<T>(comparador);
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
	

}
