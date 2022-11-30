package com.bridgelabz.hash;

public class MyLInkedList<K> {

	public INode<K> head;
	public INode tail;

	public void  MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> search(K key) {
		INode<K> currentNode = head;
		while (currentNode != null &&currentNode.getNext() != null) {
			if (currentNode.getKey().equals(key)) {
				return currentNode;
			}
			currentNode = currentNode.getNext();
		}
		return null;
	}

	public INode delete(K key) {
		INode<K> currentNode = head;
		INode<K> previous = null;
		while (currentNode != null && currentNode.getNext() != null) {
			previous = currentNode;
			if (currentNode.getKey().equals(key)) {
				previous.setNext(currentNode.getNext());
			}
			currentNode =currentNode.getNext();
		}
		return currentNode;
	}

	public void append(INode<K> currentNode) {
		if (this.tail == null)
			this.tail = currentNode;
		if (this.head == null) {
			this.head = currentNode;
		} else {
			this.tail.setNext(currentNode);
			this.tail =currentNode;
		}
	}

	@Override
	public String toString() {
		return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
	}
}
