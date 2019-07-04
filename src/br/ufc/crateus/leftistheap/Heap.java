package br.ufc.crateus.leftistheap;

public interface Heap<K> {
	void insert(K key);
	K extractMin();
	boolean contains(K key);
	boolean isEmpty();
	K min();
	void delete(K key);
}
