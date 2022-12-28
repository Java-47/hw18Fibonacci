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
			private int arr[] = new int[getQuantity()];

			@Override
			public boolean hasNext() {
				return currPos < getQuantity();
			}

			@Override
			public Integer next() {
				int currentNumber;
				try {
					currentNumber = arr[currPos - 1] + arr[currPos - 2];

				} catch (ArrayIndexOutOfBoundsException e) {
					currentNumber = 1;
				}

				arr[currPos] = currentNumber;
				currPos++;
				return currentNumber;
			}
		};
	}
}
