// This source code is UTF-8 coded - see https://stackoverflow.com/questions/9180981/how-to-support-utf-8-encoding-in-eclipse
package cardProcessor;


import static cards.Card.*;
import static cards.Card.Constant.*;
//
import cards.*;
import cards.Card.*;
import java.util.*;



/**
 * CardProcessor printing cards in reverse order - see task
 * 
 * @author   (Ilja) 
 * @version  (a version number or a date)
 */
public class CardProcessor {

	/**
	 * Die Methode reverseOrder() zieht solange Karten von einem Kartenstapel
	 * bis eine gewünschte Karte gezogen wird
	 * und gibt danach alle gezogenen Karten in umgekehrter Reihenfolge wieder aus.
	 *
	 * @param deck              der Kartenstapel von dem die Karten gezogen werden.
	 * @param lastCard          die gewünschte Karte, die die Ziehung beendet.
	 * @param dbgOutputEnable   true schaltet Kontrollausgabe an und false aus.
	 */
	public void reverseOrder(Deck deck, Card desiredCard, boolean debugOutputEnable) {
		assert deck != null && desiredCard != null : "Your deck or the desired card may not be null, please specify other parameters";
		
		
		Stack<Card> cardStack = new Stack<>();
	    boolean match = false;
	    
	  //while match is not found
		while(!match) {

			// deal another card and push it on to the stack
			Card nextCard = deck.deal();
			cardStack.push(nextCard);

			// testoutput true prints cards to console
			if(debugOutputEnable) System.out.println("Card: " + nextCard);
			// nextCard equals desired card breaks loop
			if(nextCard.equals(desiredCard)) match = true;

			
			// as long as card stack is full loop pops top card from stack for each entry
			while(!cardStack.isEmpty()) System.out.println(cardStack.pop());
			

		}
	}
}//class
