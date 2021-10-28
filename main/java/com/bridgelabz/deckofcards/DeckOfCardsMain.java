package com.bridgelabz.deckofcards;

public class DeckOfCardsMain {
	public static void main(String[] args) {
		/*
		 * In this I have created an object of DeckOfCardsGame class and just calling
		 * the method through object.
		 */
		DeckOfCardsGam deckOfCardsGame = new DeckOfCardsGam();
		deckOfCardsGame.welcome();
		deckOfCardsGame.deckOfCards();
		deckOfCardsGame.noOfPlayers();
	}
}
