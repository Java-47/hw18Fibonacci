package telran.fibonacci.model;

import java.util.Iterator;

// 1,1,2,3,5,8,13,21
public class Fibonacci implements Iterable<Integer> {
	private int quantity;

	public Fibonacci(int quantity) {
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public Iterator<Integer> iterator() {

		return new Iterator<Integer>() {
			private int currPos = 0;
			private int arr[] = {1,1};
			

			@Override
			public boolean hasNext() {
				return currPos < getQuantity();
			}

			@Override
			public Integer next() {
				int nextNum = arr[0] + arr[1];
				int current = arr[currPos %2];
				arr[currPos % 2] = nextNum;
				currPos++;
				return current;
				

			}
		};
	}
}
