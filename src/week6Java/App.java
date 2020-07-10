package week6Java;

public class App {

public static void main(String[] args) {
	//instantiate the deck object and shuffle
	Deck deck1 = new Deck();
	deck1.shuffle();
	System.out.println("WELCOME TO WAR! I mean the WAR Card GAME!");

	Player player1 = new Player(null);
	Player player2 = new Player(null);
	player2.setName("Computer");
	player1.setName("ZachAttack");
	System.out.println("THESE TWO SHALL BATTLE TO THE DEATH: " + player2.getName() + " VS " + player1.getName());


//Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.

	for(int i=1; i<=52; i++) {
		if(i % 2 == 0) player1.draw(deck1);
		else {
			player2.draw(deck1);
		}
		
	}
	// list cards in hand based on player
	//System.out.println("player1 has: ");
	player1.describe();
	//System.out.println("player2 has: ");
	player2.describe();
	
	//playing the game loop:
	for(int i=0; i<26; i++) {
		Card player1Card = player1.flip();
		Card player2Card = player2.flip();
System.out.println(player1.getName() + "'s: "+player1Card.getName().toUpperCase()+ " vs " + player2.getName()+"'s: "+player2Card.getName());

		if (player1Card.getValue() > player2Card.getValue() ) {
			player1.incrementScore();
			System.out.println("******Zachattack wins this round******");
		} else if(player2Card.getValue() > player1Card.getValue() ) {
			player2.incrementScore();
			System.out.println("******Computer wins this round******");
		} else {
			System.out.println("******TIED! BOTH SCORE-******");
			player1.incrementScore();
			player2.incrementScore();
		}
	}
//DECLARE the champion!
	if(player1.getScore() ==  player2.getScore()) {
		System.out.println("******TIED GAME GOOD JOB TO YOU BOTH!!******");
		System.out.println("FINAL TALLY: "+ player1.getName() + " score: " + player1.getScore() + ", "+ player2.getName()+" score: "+ player2.getScore());

	}else {
		System.out.println("FINAL TALLY: " + player1.getName() + " score: " + player1.getScore() + ", "+ player2.getName()+" score: "+ player2.getScore());
	}


	}

}
/*
Coding Steps:
For the final project you will be creating an automated version of the classic card game WAR.
	•	Create a class called App with a main method.
	•	Instantiate a Deck and two Players, call the shuffle method on the deck.
	•	Using a traditional for loop, iterate 52 times calling the Draw method on the other player each iteration using the Deck you instantiated.
	•	Using a traditional for loop, iterate 26 times and call the flip method for each player.
	•	Compare the value of each card returned by the two player’s flip methods. Call the incrementScore method on the player whose card has the higher value.
	•	After the loop, compare the final score from each player. 
	•	Print the final score of each player and either “Player 1”, “Player 2”, or “Draw” depending on which score is higher or if they are both the same.

*/