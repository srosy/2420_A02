package a02;

import java.util.Iterator;

/**
 * Class Deque implements iterable and can add, remove, and insert generic Items
 * to/from Deque.
 * 
 * @authors Gerald Brady, Spencer Rosenvall
 *
 * @param <Item>
 */
public class Deque<Item> implements Iterable<Item> {

	private Node<Item> head; // beginning of queue
	private Node<Item> tail; // end of queue
	private int size;

	/**
	 * Class Node creates a node of type item to be added to the Deque. Class Node
	 * provides us with information about neighboring nodes, which in turn provides
	 * self-position.
	 * 
	 * @authors Gerald Brady, Spencer Rosenvall
	 *
	 * @param <Item>
	 */
	private static class Node<Item> {
		private Item item;
		private Node<Item> next;
		private Node<Item> previous;
	}

	/**
	 * Create an empty Deque.
	 * 
	 */
	public Deque() {
		size = 0;
	}

	/**
	 * is the Deque empty?
	 * 
	 * @return
	 * 
	 */
	public boolean isEmpty() {
		if (size() <= 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Return the number of Items on the Deque.
	 * 
	 * @return
	 * 
	 */
	public int size() {
		return size;
	}

	/**
	 * Inserts Item at the front of the Deque.
	 * 
	 * @param item
	 * 
	 */
	public void addFirst(Item item) {
		if (item != null) {
			if (size() == 0) {
				head = new Node<Item>();
				head.item = item;
				tail = head;
			} else {
				Node<Item> predecessor = head;
				head.item = item;
				head.next = predecessor;
			}
			size++;
		} else {
			throw new NullPointerException("Cannot insert null item.");
		}
	}

	/**
	 * Inserts the Item at the end of the Deque.
	 * 
	 * @param item
	 */
	public void addLast(Item item) {
		// TODO
	}

	/**
	 * Delete and return the item at the front of the Deque.
	 * 
	 * @return
	 * 
	 */
	public Item removeFirst() {
		return null;
		// TODO
	}

	/**
	 * Delete and return the item at the end of the Deque.
	 * 
	 * @return
	 * 
	 */
	public Item removeLast() {
		return null;
		// TODO
	}

	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Test client for class Deque.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
