package com.bridgelabz.hash;

public class MyLInkedList<K> {

	public INode<K> head;
	public INode tail;

	void MyLinkedList() {
		this.head = null;
		this.tail = null;
	}

	public INode<K> search(K key) {
		INode<K> node = head;
		while (node != null && node.getNext() != null) {
			if (node.getKey().equals(key)) {
				return node;
			}
			node = node.getNext();
		}
		return null;
	}

	public void append(INode<K> node) {
		if (this.tail == null)
			this.tail = node;
		if (this.head == null) {
			this.head = node;
		} else {
			this.tail.setNext(node);
			this.tail = node;
		}
	}

		@Override
		public String toString() {
			return "MyLinkedList [head=" + head + ", tail=" + tail + "]";
		} 
}
