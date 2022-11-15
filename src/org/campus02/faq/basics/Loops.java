package org.campus02.faq.basics;

import java.util.Random;

public class Loops {
	public static void main(String[] args) {
//		printRandomNumber();

//		printRandomNumbersUntil3();

		countFromRandomToRandom();
	}

	private static void countFromRandomToRandom() {
		Random generator = new Random();

		int n1 = generator.nextInt(10) + 1;
		int n2 = generator.nextInt(10) + 1;

		int start = Math.min(n1, n2);
		int end = Math.max(n1, n2);

		for (int i = start; i <= end; i++) {
			System.out.println(i);
		}
	}

	private static void printRandomNumbersUntil3() {
		Random generator = new Random();

		int number = generator.nextInt(6) + 1;

		while (number != 3) {
			System.out.println(number);
			number = generator.nextInt(6) + 1;
		}

		System.out.println("Good bye!");
	}

	private static void printRandomNumber() {
		// Zufallszahlen ausgeben
		Random randomNumberGenerator = new Random();

		int randomNumber = randomNumberGenerator.nextInt(10);

		System.out.println("randomNumber = " + randomNumber);
	}
}
