package week6Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
	private List<Card> cards = new ArrayList<Card>();
	private String[] suit = {"Hearts", "Diamonds", "Clubs", "Spades"};
	
	public String switchName(int value) {
		switch (value) {
		case 2 : return "Two";
		case 3 : return "Three";		
		case 4 : return "Four";	
		case 5 : return "Five";
		case 6 : return "Six";
		case 7 : return "Seven";
		case 8 : return "Eight";
		case 9 : return "Nine";
		case 10 : return "Ten";
		case 11 : return "Jack";
		case 12 : return "Queen";
		case 13 : return "King";
		case 14 : return "Ace";
	}
		return null;
	}
	//Constructor
	public Deck() {
		for(int i = 0; i < suit.length; i++) {
			for(int j = 2; j < 15; j++) {
				String tempName = switchName(j) +" of "+ suit[i];
				cards.add(new Card(tempName, j));
				}
			}
		}

	public void shuffle() {
		Collections.shuffle(cards);
		//for(Card key : cards)
		//System.out.println("list: "+ key.getName());
	}
	
	public Card draw() {
		return cards.remove(0);
	}
	
	public List<Card> getcards() {
		return cards;
	}
	
	public void setcards(List<Card> cards) {
		this.cards = cards;
	}
}
/*
Deck
•	Fields
•	cards (List of Card)
•	Methods
•	shuffle (randomizes the order of the cards)
•	draw (removes and returns the top card of the Cards field)
•	In the constructor, when a new Deck is instantiated, the Cards field should be populated with the standard 52 cards.
*/