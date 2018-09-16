package interface_examples;

import interface_examples.Series_Interface;
import interface_examples.ByTwo;
import interface_examples.ByThree;

public class SeriesDemo {

	public static void main(String[] args) {
		Series_Interface ob_ref;
		ByTwo ob_bytwo = new ByTwo();
		ByThree ob_bythree = new ByThree();

		for (int i = 0; i < 10; i++) // Mixing both ByTwo and ByThree class objects in the for loop print
		{
			ob_ref = ob_bytwo;
			System.out.println(ob_ref.getNext());
			ob_ref = ob_bythree;
			System.out.println(ob_ref.getNext());
		}

		System.out.println("Resetting ByTwo object");
		ob_ref = ob_bytwo;
		ob_ref.reset();
		for (int i = 0; i < 10; i++) {
			System.out.println(ob_ref.getNext());
		}

		System.out.println("Resetting ByThree object");
		ob_ref = ob_bythree;
		ob_ref.reset();
		for (int i = 0; i < 10; i++) {
			System.out.println(ob_ref.getNext());
		}

		System.out.println("Setting to start from 100 ByTwo object");
		ob_ref = ob_bytwo;
		ob_ref.setStart(99);
		;
		for (int i = 0; i < 10; i++) {
			System.out.println(ob_ref.getNext());

		}
		ob_ref.showMsg(); // example to show interface default method. Default implementation is defined
							// in Series_interface code.

	}

}
