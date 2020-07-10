package week6Java;

public class Card {
	private int value;
	private String name;
	
	public Card(String name, int value) {
		 this.name = name;
		 this.value = value;
		}	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean describe() {
		System.out.println("name: " + this.name);
		System.out.println("value: " + this.value);
		return true;
	}
}
//Card
//•	Fields
//•	value (contains a value from 2-14 representing cards 2-Ace)
//•	name (e.g. Ace of Diamonds, or Two of Hearts)
//•	Methods
//•	Getters and Setters
//•	describe (prints out information about a card)