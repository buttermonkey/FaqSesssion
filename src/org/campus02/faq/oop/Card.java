package org.campus02.faq.oop;

public class Card {
	private Face face;
	private Suit suit;

	public Card(Face face, Suit suit) {
		this.face = face;
		this.suit = suit;
	}

	@Override
	public String toString() {
		return face + " of " + suit;
	}
}
