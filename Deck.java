package warGame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
//List of Card
	public List<Card> cards = new ArrayList<Card>(); 
	
//Deck
	public Deck() {
		String[] rank =  {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King","Ace",};
		String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
	    for (int i = 0; i < 4; i++) {
	    	for(int x = 2; x <= 14; x++) {
	    		cards.add(new Card (x, rank[x - 2] + " of " + suit[i]));
	    	}
	    }
	}

	public List<Card> getCards(){
		return cards;
	}
	
	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
//draw method 
			public Card draw () { 
				if (cards.isEmpty()) {
					System.out.println("There are no cards left in the deck!");
					return null;
				} else {
					Card topCard = cards.get(0);
					cards.remove(0);
					return topCard;
				}

			}

			//shuffle method shuffles the order of the cards
				public void shuffle() { 				
					Collections.shuffle(cards); 
				}
	

} // end of class
