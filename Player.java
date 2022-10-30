package warGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

	//hand field
	private List<Card> hand = new ArrayList<Card>(); 
	//score field
	private int score;
	//name field
	private String name;
	
	public Player (String name) {
		this.score = 0;
		this.name = name;
	}
	
	public void drawHand (Deck deck) {
		hand.add(deck.draw());
	}
	
	public int getScore() {
		return score;
	}
	
	public String getName() {
		return name;
	}
	
	public List<Card> getHand(){
		return hand;
	}
	
	public void setHand(List<Card> hand) {
		this.hand = hand;
	}
	public Card getCard() {
		return getCard();
	}
	
	//describe method
	public void describePlayer() { 
		System.out.println("\nPlayer " + name + " has " + score + " points!");
		for(Card card: hand ) {
			card.describe();
		}
		return;
	}
	
	//flip card method
	public Card flip() { 
		Card topCard = hand.get(0);
		hand.remove(0);
		return topCard;
		
	}
	
	public void incrementScore() { //adds 1 to the player's score field 
		this.score++;
	}
	public void describeCard() {
		System.out.println("Card: " + hand + "\n");
		
	}
	
} //end of Player class
