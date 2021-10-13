package com.bridgelabz;

/**
 * 
 * DeckOfCards Program
 * 
 * @author Sangeeta Math
 *
 */

public class DeckOfCards {
	//Driver code
	public static void main(String[] args) {
		System.out.println("Welcome to Deck Of Card Problem");

		String[] deck = new String[52];
		String[] suits = { "Club", "Diamond", "Heart", "Spade" };
		String[] ranks = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Ace", "King", "Queen", "Jack" };
		int pos = 0;
		for (int i = 0; i < suits.length; i++) {
			for (int j = 0; j < ranks.length; j++) {
				deck[pos] = suits[i] + ranks[j];

			}
		}
	}
}