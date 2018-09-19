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

	private Deque<Item> d;
	private Item head;
	private Item tail;
	private int size;

	/**
	 * Create an empty Deque.
	 * 
	 */
	public Deque() {
		d = new Deque<Item>();
	}

	/**
	 * is the Deque empty?*
	 * 
	 * @return
	 * 
	 */
	public boolean isEmpty() {
		if (d.size() <= 0) {
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
		int count = 0;
		for (Item el : d) {
			if (el != null)
				count++; // check if el is actually something during iteration.
		}
		return count;
	}

	/**
	 * Inserts Item at the front of the Deque.
	 * 
	 * @param item
	 * 
	 */
	public void addFirst(Item item) {
		if (item != null) {
			if (size == 0) {
				tail = head;
				head = item;
				size++;
			}
			if (size >= 1) {

				Item next = head;
				head = item;

				// tail =

				for (Item i : d) {
					if (i == tail) {
						// stop
					} else {

					}
				}

			}

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
