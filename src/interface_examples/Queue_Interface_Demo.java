/*
This program is demo for 
1. Fixed Queue
2. Circular Queue
3. Dynamic Queue
*/
package interface_examples;

import interface_examples.FixedQueue;

public class Queue_Interface_Demo {

	public static void main(String[] args) {

		FixedQueue obj_fixq = new FixedQueue(3);
		CircularQueue obj_circq = new CircularQueue(3);
		DynamicQueue obj_dynq = new DynamicQueue(3);

		// Fixed Queue Demo code starts
		System.out.println("++++++++++++++++Fixed queue Demo Starts+++++++++++++++++++");

		// To put the characters in fixed queue
		System.out.println("Put starts");
		obj_fixq.put('R');
		obj_fixq.put('A');
		obj_fixq.put('J');
		obj_fixq.put('E');
		obj_fixq.put('S');
		obj_fixq.put('H');

		// To print the fixed queue
		System.out.println("\nPrinting the Fixed queue:");
		for (int i = 0; i < obj_fixq.qlength + 1; i++) {

			System.out.print(obj_fixq.get());
		}
		System.out.println("\n++++++++++++++++Fixed queue Demo Ends+++++++++++++++++++");
		// Fixed Queue Demo code ends
		//
		// Circular Queue Demo code starts
		System.out.println("\n++++++++++++++++Circular queue Demo Starts+++++++++++++++++++");
		// To put the characters in circular queue
		System.out.println("Put starts");
		obj_circq.put('R');
		obj_circq.put('A');
		obj_circq.put('M');
		obj_circq.put('Z');

		// To print the circular queue
		System.out.println("\nPrinting the Circular queue:");
		for (int j = 0; j < 3; j++) {

			System.out.print(obj_circq.get());
		}
		System.out.println(
				"\nConsumed all the messages in the circular Queue, Good to overwrite the queue with new messages");
		obj_circq.put('R');
		obj_circq.put('A');
		obj_circq.put('J');

		System.out.println("\nPrinting the Circular queue 2nd time:");
		for (int j = 0; j < 3; j++) {

			System.out.print(obj_circq.get());
		}
		// Circular Queue Demo code ends

		// Dynamic Queue Demo code starts
		System.out.println("\n++++++++++++++++Dynamic queue Demo Starts+++++++++++++++++++");
		// To put the characters in Dynamic queue
		System.out.println("Put starts");
		obj_dynq.put('R');
		obj_dynq.put('A');
		obj_dynq.put('J');
		obj_dynq.put('E');
		obj_dynq.put('S');
		obj_dynq.put('H');
		obj_dynq.put(' ');
		obj_dynq.put('R');
		obj_dynq.put('A');
		obj_dynq.put('M');
		obj_dynq.put('A');
		obj_dynq.put('N');

		// To print the Dynamic queue
		System.out.println("\nPrinting the Dynamic queue:");
		for (int i = 0; i < obj_dynq.qlength + 1; i++) {

			System.out.print(obj_dynq.get());
		}
		System.out.println("\n++++++++++++++++Dynamic queue Demo Ends+++++++++++++++++++");

	}

}
