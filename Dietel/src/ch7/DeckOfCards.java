package ch7;

import java.util.Random;

public class DeckOfCards {
	private Card[] deck;
	private int currentCard;
	private static final int NUMBER_OF_CARDS = 52;
	
	//RNG
	private static final Random randomNumbers = new Random();
	
	
	// constructor fills deck of cards
	public DeckOfCards()
	{
		String[] faces = { "Ace", "Two", "Three", "Four", "Five", "Six", 
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
		
		String[] suits = { "Hearts", "Spades", "Diamonds", "Clubs" };
		
		deck = new Card[ NUMBER_OF_CARDS ];
		currentCard = 0;
		
		// populate  deck with Card objects
		for ( int count = 0; count < deck.length; count++ )
			deck[ count ] =
			new Card( faces[ count % 13 ], suits[ count /13 ] );
		}
	
	// shuffle
	public void shuffle()
	{
		currentCard = 0;
		
		
		// for each card
		for ( int first = 0; first < deck.length; first++ )
		{
			
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			
			// swap current Card
			Card temp = deck[ first ];
			deck[ first ] = deck[ second ];
			deck[ second ] = temp;
		}
	}
	
	public Card dealCard()
	{
		//determine if cards remain to be dealt
		if( currentCard < deck.length )
			return deck[ currentCard++ ];
		else
			return null;
	}

}
