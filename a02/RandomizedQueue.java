/************************************************
 * Author(s): Gerald Brady, Spencer Rosenvall
 * Class: CSIS 2420
 * Professor: Frau Posch
 * Assignment: A02_RadomizedQueuesAndDeques
 ************************************************/

package a02;

import java.util.Iterator;

public class RandomizedQueue<Item> implements Iterable<Item> {

	private int size;
	private Item[] items;

	/**
	 * Constructs an empty randomized queue.
	 */
	public RandomizedQueue() {
		items = (Item[]) new Object[1]; // min size for array is 1, cast as FAQ suggests
		size = 0;
	}

	/**
	 * Checks if the queue is empty.
	 * 
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0 ? true : false;
	}

	/**
	 * Returns the number of items on the queue.
	 * 
	 * @return int
	 */
	public int size() {
		return 0;// TODO

	}

	/**
	 * Adds an item to the queue.
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {
		// TODO
		// check end of list ? create new array with array.length * 2.
		// add item to queue.
	}

	/**
	 * Deletes and returns a random item.
	 * 
	 * @return Item
	 */
	public Item dequeue() {
		// TODO
		// check if size <= (array.length / 4) ? create new array with half size.
		// return the item dequeued.
		return null;

	}

	/**
	 * Returns (but does not delete) a random item.
	 * 
	 * @return Item
	 */
	public Item sample() {
		// select a random item.
		return null;// TODO

	}

	/**
	 * Returns an independent iterator over items in random order
	 */
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * Test client for Class RandomizedQueue. Tests functionality of the class.
	 */
	public static void main(String[] args) {
		// TODO
	}

}