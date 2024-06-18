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
* @author   (Fenja, Ilja) 
* @version  (a version number or a date)
*/
public class CardProcessor {
 
    /**
     * Die Methode removeDuplicates() entfernt Doppelte aus den übergebenen Karten.
     * Welche Karte (von den mehrfach vorhandenen Karten) übrig bleibt ist egal.
     * Wichtig ist, dass es bei den als Ergebnis abgelieferten Katen keine Doppelten gibt,
     * aber sonst jede Karten erhalten bleibt. 
     * @param debugOutputEnable gibt Testfälle aus, i.d.F werden Doppeltkarten ausgegeben
     * @param cards     die übergebenen Karten aus denen die Doppelten entfernt werden.
     * 
     * @return          die Karten befreit von Doppelten.
     */
    public Card[] removeDuplicates(boolean debugOutputEnable, Card...cards) {
        // check for valid parameters
        assert cards != null : "Invalid parameter(s), cards may not be null!";
 
        // new array list for card storage
        ArrayList<Card> cardsToOrder = new ArrayList<Card>();
        // for each card in cards array
        for(Card card : cards) {
            assert card != null : "Invalid argument, card may not be null";
 
            //if cards to order does not contain card
            if(!cardsToOrder.contains(card)) {
                // add the card to array list
                cardsToOrder.add(card);
                //for debug purposes card may be printed out
            } else if(debugOutputEnable && cardsToOrder.contains(card)) System.out.println("Duplicate card: " + card);
 
 
        }
        int size = cardsToOrder.size();
        Card[] orderedCards = new Card[size];
 
        return cardsToOrder.toArray(orderedCards);
    }
 
}//class