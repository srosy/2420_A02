/************************************************
 * Author(s): Gerald Brady, Spencer Rosenvall
 * Class: CSIS 2420
 * Professor: Margarethe Posch
 * Assignment: A02_RadomizedQueuesAndDeques
 ************************************************/
package a02;

import edu.princeton.cs.algs4.StdIn;

/**
 * Class Subset is a test client for classes Deque.java and
 * RandomizedQueue.java. Class demonstrates operation of RandomizedQueue by
 * adding and removing Strings from the queue.
 * 
 * @author Gerald Brady, Spencer Rosenvall
 *
 */
public class Subset {

	public static void main(String[] args) {
		String[] stringArray = StdIn.readAllStrings(); // read in all the strings
		RandomizedQueue<String> rq = new RandomizedQueue<>();
		int k = Integer.parseInt(args[0]);

		for (String s : stringArray) { // Add String to queue.
			rq.enqueue(s);
		}

		for (int i = 0; i < k; i++) { // Remove String from deque.
			System.out.println(rq.dequeue());
		}
	}
}