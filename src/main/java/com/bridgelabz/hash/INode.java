package com.bridgelabz.hash;

public interface INode<K> {

	K getKey();

	void setKey(K key);

	INode<K> getNext();

	void setNext(INode<K> next); 

}

