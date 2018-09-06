package interface_examples;

public class ByThree implements Series_Interface {
	int val;
	int start;

	ByThree() {
		val = 0;
		start = 0;
	}

	public int getNext() {
		val = val + 3;
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
