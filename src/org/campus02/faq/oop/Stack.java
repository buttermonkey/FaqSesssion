package org.campus02.faq.oop;

public class Stack {
	private int[] data;
	private int currentElement;

	public Stack(int[] data) {
		this.data = data;
		currentElement = -1;
	}

	public void push(int value) {
		if (currentElement + 1 >= data.length) {
			System.out.println("This went wrong - I'm not big enough for your stuff!");
			return;
		}

		data[++currentElement] = value;
	}

	public int pop() {
		if (currentElement <= 0) {
			System.out.println("This went wrong - I'm already empty. Please pop someone else!");
			return -1;
		}

		return data[currentElement--];
	}
}
