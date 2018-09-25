/************************************************
 * Author(s): Gerald Brady, Spencer Rosenvall
 * Class: CSIS 2420
 * Professor: Margarethe Posch
 * Assignment: A02_RadomizedQueuesAndDeques
 ************************************************/

package a02;

import java.util.Iterator;
import java.util.NoSuchElementException;

import edu.princeton.cs.algs4.StdRandom;

public class RandomizedQueue<Item> implements Iterable<Item> {
	private Item[] items;
	private int size;

	/**
	 * Constructs an empty randomized queue.
	 **/
	public RandomizedQueue() {
		items = (Item[]) new Object[1]; // copied exactly as specified in frequently asked questions
		size = 0;
	}

	/**
	 * Checks if the queue is empty.
	 *
	 * @return boolean
	 */
	public boolean isEmpty() {
		return size == 0;
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
		if (item == null) {
			throw new NullPointerException();
		}
		determineResize();
		items[size] = item;
		size++;
	}

	/**
	 * Deletes and returns a random item.
	 *
	 * @return Item
	 */
	public Item dequeue() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}

		int random = StdRandom.uniform(size);
		Item item = items[random];
		size--;
		items[random] = items[size];
		items[size] = null; // loitering handling
		determineResize();
		return item;
	}

	/**
	 * Determines if items array should resize and resizes conditionally.
	 */
	private void determineResize() {
		// resize smaller at 1/4
		if (size > 2 && size == (items.length / 4)) {
			resize(items.length / 2);
		}
		if (size == items.length) {
			resize(items.length * 2);
		}
	}

	/**
	 * Returns (but does not delete) a random item.
	 * 
	 * @return Item
	 */
	public Item sample() {
		if (isEmpty()) {
			throw new java.util.NoSuchElementException();
		}
		int random = StdRandom.uniform(size);
		return items[random]; // don't create a new item, just return the reference (sample) to one
		// otherwise we loiter.
	}

	private void resize(int newSize) {
		@SuppressWarnings("unchecked")
		Item tempItems[] = (Item[]) new Object[newSize];

		for (int i = 0; i < size; i++) {// TODO check to see if size (i < size) should be (i < newSize)
			tempItems[i] = items[i];
		}
		items = tempItems;
	}

	@Override
	public Iterator<Item> iterator() {
		return new IndependentIterator();
	}

	/**
	 * Class IndependentIterator iterates through a list of items.
	 */
	private class IndependentIterator implements Iterator<Item> {

		private Item[] independentIteratorItems;
		private int index;

		/**
		 * Constructs an independent, random iterator.
		 */
		@SuppressWarnings("unchecked")
		public IndependentIterator() {
			independentIteratorItems = (Item[]) new Object[size];
			for (int i = 0; i < size; i++) { // copy items[]
				independentIteratorItems[i] = items[i];
			}
			StdRandom.shuffle(independentIteratorItems); // randomize
		}

		/**
		 * Returns a boolean if the iterator has a next item.
		 */
		@Override
		public boolean hasNext() {
			return index < independentIteratorItems.length;
		}

		/**
		 * Returns the next item.
		 */
		@Override
		public Item next() {
			if (hasNext()) {
				return independentIteratorItems[index++];
			} else {
				throw new NoSuchElementException();
			}
		}

		/**
		 * Throws a UnsupportedOperationException because the user shouldn't remove with
		 * this iterator.
		 */
		public void remove() {
			// Handle should remove be called during iteration
			throw new UnsupportedOperationException("Cannot remove during iteration");
		}
	}
}
