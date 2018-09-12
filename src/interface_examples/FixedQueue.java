package interface_examples;

public class FixedQueue implements Queue_Interface {

	private char q[]; // Array to hold the queue
	private int getloc, putloc; // Pointers to hold the get and put index
	public int qlength;
	
	public FixedQueue(int size) {
		getloc = putloc = 0;
		q = new char[size]; // Allocating memory for the queue
		qlength=q.length;
	}

	@Override
	public char get() {
		if (getloc == putloc) {
			System.out.println("\nQueue is empty,nothing to get");
			return (char) 0;
		}

		return q[getloc++];
	}

	@Override
	public void put(char input) {
		if (putloc == q.length) {
			
			System.out.println("\nERROR: Put failed to insert '"+input+"' as queue is full");
			return;
		}
		q[putloc] = input;
		System.out.println("\nInserted character '"+input+"'into queue");
		putloc++;
	}

}
