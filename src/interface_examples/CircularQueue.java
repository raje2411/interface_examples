package interface_examples;

public class CircularQueue implements Queue_Interface {

	private char q[]; // Array to hold the queue
	private int getloc, putloc; // Pointers to hold the get and put index
	public int qlength;

	public CircularQueue(int size) {
		getloc = putloc = 0;
		q = new char[size + 1]; // Allocating memory for the queue
		qlength = q.length;
	}

	@Override
	public char get() {

		// getloc = 0;
		if (getloc == putloc) {

			System.out.println("\nQueue is empty,nothing to get");
			return (char) 0;
		}

		char ch = q[getloc++];

		if (getloc == q.length) {
			getloc = 0;
		}
		return ch;

	}

	@Override
	public void put(char input) {

		if (putloc + 1 == getloc | ((putloc == q.length - 1) & (getloc == 0))) {
			System.out.println("\nERROR: Put failed to insert '" + input + "' as queue is full");
			return;
		}
		q[putloc++] = input;
		System.out.println("\nInserted character '" + input + "' into queue");
		if (putloc == q.length) {
			putloc = 0;
		}

	}

}
