package org.campus02.faq.basics;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] suits = new String[]{
				"Hearts", "Diamonds", "Clubs", "Spades"
		};

		printArrayWithIndexLoop(suits);

		printArrayWithForeach(suits);
	}

	private static void printArrayWithForeach(String[] suits) {
		// You should use "suit" instead of "element" in you own code!
		for (String element : suits) {
			System.out.println("Suit: " + element);
		}
	}

	private static void printArrayWithIndexLoop(String[] suits) {
		// Suit: Hearts
		// Suit: Diamonds
		// ...
		for (int i = 0; i < suits.length; i++) {
			System.out.println("Suit: " + suits[i]);
		}
	}
}
