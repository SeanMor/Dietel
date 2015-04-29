package ch7;

public class Card {
	private String face;
	private String suit;
	
	//two arg constructor
	public Card( String cardFace, String cardSuit )
	{
		face = cardFace;
		suit = cardSuit;
	}
	
	// return String representation of Card
	public String toString()
	{
		return face + " of " + suit;
	}
	

}
