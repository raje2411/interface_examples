package interface_examples;

public interface Series_Interface {

	int getNext();
	void reset();
	void setStart(int x);
	default void showMsg() {
		System.out.println("this message is from a default method from interface Series_Interface ");
	}
}
