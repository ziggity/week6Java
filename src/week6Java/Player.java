package week6Java;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private List<Card> hand = new ArrayList<Card>();
	private int score;
	private String name;
	
	//constructor
	public Player(String name) {
		this.name = name;
		score = 0;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void describe() {
		System.out.println(name + " has these cards: ");
		for(Card aCardInHand : hand) {
			aCardInHand.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);	
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
}
/*
Player
•	Fields
•	hand (List of Card)
•	score (set to 0 in the constructor)
•	name
•	Methods
•	describe (prints out information about the player and calls the describe method for each card in the Hand List)
•	flip (removes and returns the top card of the Hand)
•	draw (takes a Deck as an argument and calls the draw method on the deck, adding the returned Card to the hand field)
•	incrementScore (adds 1 to the Player’s score field)
*/