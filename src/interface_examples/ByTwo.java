package interface_examples;

public class ByTwo implements Series_Interface {
	int val;
	int start;

	ByTwo() {
		val = 0;
		start = 0;
	}

	public int getNext() {
		val = val + 2;
		return val;
	}

	public void setStart(int x) {
		val = x;
		start = x;
	}

	public void reset() {
		val = start;
	}

}
