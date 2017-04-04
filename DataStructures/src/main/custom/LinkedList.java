package main.custom;

public class LinkedList<T> {
	Node<T> head;
	Node<T> tail;
	int count = 0;

	/**
	 * Adds a value to the end of the list.
	 * 
	 * @param val
	 */
	public void add(T val) {
		addLast(val);
	}
	
	public void addLast(T val){
		if (head == null) {
			head = new Node<T>();
			tail = head;
			head.value = val;
		} else {
			tail.next = new Node<T>() {
				{
					value = val;
					prev = tail;
				}
			};
			tail = tail.next;
		}
		count++;
	}

	public boolean delete(int index) {
		if (index > count || index < 0) {
			return false;
		} else if (index == 0) {
			unlinkFirst();
		} else if (index == count - 1) {
			unlinkLast();
		} else {
			Node<T> node = head;
			while (index > 0) {
				node = node.next;
				index--;
			}
			unlink(node);
		}
		count--;
		return true;
	}

	public boolean delete(T value) {
		int counter = count;
		Node<T> node = head;
		while (counter > 0) {
			if (node.value.equals(value)) {
				unlink(node);
				count--;
				return true;
			}
			node = node.next;
			counter--;
		}
		return false;
	}

	private void unlinkLast() {

		// if (tail.equals(head)) {
		// head = null;
		// } else {
		tail.prev.next = null;
		tail.value = null;
		// }

	}

	private void unlinkFirst() {
		// if the list has one element
		if (tail.equals(head)) {
			head = null;
		} else {
			// previous node hanging
			Node<T> node = head.next;
			head = node;
		}
	}

	private void unlink(Node<T> node) {
		node.prev.next = node.next;
		node.next.prev = node.prev;
		node = null;
	}

	/**
	 * Returns the number of values in the list.
	 * 
	 * @return
	 */
	public int size() {
		return count;
	}

	/**
	 * Removes all elements from the list.
	 */
	public void clear() {
		head = null;
		tail = head;
	}
}
