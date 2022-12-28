package telran.fibonacci.controller;

import telran.fibonacci.model.Fibonacci;

public class FibonacciAppl {

	public static void main(String[] args) {
		Fibonacci fibonacci = new Fibonacci(8);
		int sum = 0;
		for (Integer number : fibonacci) {

			System.out.print(number + " ");
			sum += number;
		}
		System.out.println();
		System.out.println("sum = " + sum);
	}

}
