// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
import cards.*;
import cards.Card.*;
import java.util.*;


/**
 * CardProcessor removing duplicates - see task
 * 
 * @author   (your name(s)) 
 * @version  (a version number or a date)
 */
public class CardProcessor {

	/**
	 * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
	 * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
	 * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
	 * aber sonst jede Karten erhalten bleibt. 
	 *
	 * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
	 * 
	 * @return          die Karten befreit von Doppelten.
	 */
	public Card[] removeDuplicates(Card...cards ) {
		// Check if card array is null 
		assert cards != null : "Invalid parameter(s), cards may not be null!";

		
		// Make new array list to store cards
		ArrayList<Card> cardsToOrder = new ArrayList<Card>();
		int size = cardsToOrder.size();

		// for each card in cards
		for(Card card : cards) {
			// check if corresponding card has value null
			assert card != null : "Invalid argument, card may not be null";

			//card already contained print out which card is duplicate
			if(!cardsToOrder.contains(card)) {
				cardsToOrder.add(card);	
			} // else card is not contained so add it
			else System.out.println("Duplicate card: " + card);	
		}

		// make new card array size of array list
		Card[] orderedCards = new Card[size];

		// return orderedCards array with elements of cardsToOrder
		return cardsToOrder.toArray(orderedCards);
	} 
}//class
