package warGame;

public class App {
	public static void main(String[] args) {
		
		System.out.println("Welcome to War Card Game!");
		System.out.println("Hello Player 1 and Player CPU\n");
		
		Deck deck = new Deck(); //instantiates a deck
		deck.shuffle(); //shuffle method on deck
		
		Player player1 = new Player("1"); //instantiates player 1
		Player player2 = new Player("2"); //instantiates player 1
		
		
		for(int i = 0; i < 52; i++){
			if (i % 2 == 0) {
			player1.drawHand(deck); 
			player2.drawHand(deck);
			}
		}
		
	
		
		for(int i = 1; i <= 26; i++) {
			Card player1Card = player1.flip();
			Card player2Card = player2.flip();
			
			player1.describePlayer();
			player2.describePlayer();
			
		if (player1Card.getValue() > player2Card.getValue()) {
				player1.incrementScore();
			} else if (player1Card.getValue() < player2Card.getValue()) {
				player2.incrementScore();
			} else {
				System.out.println("Draw!\n");
			} 
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("\nPlayer 1 Score: " + player1.getScore());
			System.out.println("Player 2 Score: " + player2.getScore());
			System.out.println("Player 1 wins!\n");
		} else if (player1.getScore() < player2.getScore()) {
			System.out.println("\nPlayer 1 Score: " + player1.getScore());
			System.out.println("Player 2 Score: " + player2.getScore());
			System.out.println("Player 2 wins!\n");
		} else {
			System.out.println("\nPlayer 1 Score: " + player1.getScore());
			System.out.println("Player 2 Score: " + player2.getScore());
			System.out.println("Draw!\n");
		}

		
	} // End main method

}} //end of App class
