package warGame;
import java.util.ArrayList;
import java.util.List;

public class Card {

//Value field 
private int value; // contains 2,3,4,5,6,7,8,9,10,11,12,13,14
//Name Field
private String name; // {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};


public Card (int value, String name) {
	this.value = value;
	this.name = name;
}
public void describeCard() {
	System.out.println("Card: " + name + "\n" );
}
//getter for name 
public String getName() {
	return name;
}
	
//setter for name 
	public void setName(String name) {
		this.name = name;
	}
	
//getter for value
	public int getValue() {
		return value;
	}
	
//setter for value
	public void setValue(int value) {
		this.value = value;  
	}
	
//describe method 
	public void describe () {
		System.out.println(name + " , Value: " + value);
	}
	
List<Card> suits = new ArrayList<Card>();
	
		
}

