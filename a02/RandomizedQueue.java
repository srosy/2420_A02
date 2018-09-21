package a02;

/************************************************
 * Author(s): Gerald Brady, Spencer Rosenvall
 * Class: CSIS 2420
 * Professor: Margarethe Posch
 * Assignment: A02_RadomizedQueuesAndDeques
 ************************************************/

import java.util.Iterator;
import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
    private Item[] items; 
    private int size = 0;
    
	/**
	 * Constructs an empty randomized queue.
	 **/
	public RandomizedQueue() {
		items = (Item[]) new Object[1]; //TODO how do we deal with the Type Safety?
		size = 0;
		
	}

	/**
	 * Checks if the queue is empty.
	 *
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;// TODO no need to add this: (? true : false;)

	}

	/**
	 * Returns the number of items on the queue.
	 * 
	 * @return int
	 */
	public int size() {
		return size;

	}
	
	/**
	 * Adds an item to the queue.
	 * 
	 * @param item
	 */
	public void enqueue(Item item) {
		if (item == null)
			throw new NullPointerException();
		
		if (size == items.length)
			resize(items.length * 2);
		
		items[size] = item;
		size++;
		
	}
	
	/**
	 * Deletes and returns a random item.
	 *
	 * @return Item
	 */
	public Item dequeue() {
		if (isEmpty())
			throw new java.util.NoSuchElementException();
		
		int random = StdRandom.uniform(size);
		Item item = items[random];
		
		if (random != size -1)
			items[random] = items[size - 1];
		
		// Loitering removal?  is this how I do it??
		items[size - 1] = null;
		size--;
		
		// resize smaller at 1/4
		if (size > 0 && size == (items.length / 4))
			resize(items.length / 2);
		
		return item;
		
	}
	
	/**
	 * Returns (but does not delete) a random item.
	 * 
	 * @return Item
	 */
	public Item sample() {
		//TODO do we need to add this if it is empty?
//		if (isEmpty())
//			throw new java.util.NoSuchElementException();
			
		int random = StdRandom.uniform(size);
		Item item = items[random];
		
		return item;

	}
	
	//TODO we can add a resize method, right??
    private void resize(int newSize) {
        Item tempItems[] = (Item[]) new Object[newSize];//TODO how do we deal with the Type Safety?

        for (int i = 0; i < size; i++) {//TODO check to see if size (i < size) should be (i < newSize)
        	tempItems[i] = items[i];
        }
        items = tempItems;

    }	
	
	/**
	 * Returns an independent iterator over items in random order
	 */
	@Override
	public Iterator<Item> iterator() {
		// TODO Auto-generated method stub
		//throw a java.lang.UnsupportedOperationException if the client calls the remove() method in the iterator
		return null;
	}

	/**
	 * Test client for Class RandomizedQueue. Tests functionality of the class.
	 */
	public static void main(String[] args) {
		// TODO
	}

}
