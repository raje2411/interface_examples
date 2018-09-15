package interface_examples;

public class DynamicQueue implements Queue_Interface {

	private char q[]; // Array to hold the queue
	private int getloc, putloc; // Pointers to hold the get and put index
	public int qlength;

	public DynamicQueue(int size) {
		getloc = putloc = 0;
		q = new char[size]; // Allocating memory for the queue
		qlength = q.length;
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
			char t[] = new char[q.length * 2];
			for (int z = 0; z < q.length; z++) {
				t[z] = q[z];
			}
			q = t;
			qlength = q.length;
			System.out.println("\nINFO: Queue size is dynamically increased now");
		}

		q[putloc] = input;
		System.out.println("\nInserted character '" + input + "' into queue");
		putloc++;
	}

}
