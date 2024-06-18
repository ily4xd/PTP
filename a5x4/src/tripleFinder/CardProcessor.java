package tripleFinder;
 
import cards.Card;
import cards.Card.Rank;
import java.util.ArrayList;
import java.util.List;
 
/**
* CardProcessor finding triplets
* 
* @author   (Fenja, Ilja) 
* @version  (18.06.2024, V1)
*/
 
public class CardProcessor implements CardProcessor_I {
    /**
     * Die Methode process() füllt die ArrayLists mit Karten. 
     * Nach jeder hinzugefügten Karten prüft die Methode ob Drillinge vorhanden sind.
     * 
     * @param cards     die übergebenen Karten in denen die Drillinge gesucht werden.
     * 
     * @return          gibt drei gleichrangige Karten als String aus.
     */

    private List<Card> cards; //store all cards
    private List<Rank> ranks; //store the ranks of the cards
    private int cardCounter; //amount of cards
 
    //constructor without parameters
    public CardProcessor() {
        cards = new ArrayList<>();
        ranks = new ArrayList<>();
        cardCounter = 0;
    }
    //process method
    @Override
    public Object process(Card card) {
        // check if params are valid
        assert card != null: "Invalid parameter, please specify an actual card.";
        
        
        
        //add cards and their rank to the lists
        cards.add(card); 
        ranks.add(card.getRank());
        cardCounter++;
       
 
        int firstIndex = ranks.indexOf(card.getRank()); //find card in list with same rank
        int lastIndex = ranks.lastIndexOf(card.getRank()); //to create sublist and compare ranks
 
        if (lastIndex != firstIndex && firstIndex != -1) { //must have same rank and firstindex must exist
            //find second card in list with same rank
            List<Rank> subList = ranks.subList(firstIndex + 1, lastIndex);
            int subListSecondIndex = subList.indexOf(card.getRank()); 
        	int secondIndex = (subListSecondIndex != -1) ? subListSecondIndex + firstIndex + 1 : -1;
            
                            //ranks. > Liste die wir uns angucken
                            //subList > Ausschnitt den wir uns angucken
                            //indexOf > Methode um den Index der 2. Karte zu bekommen (aber nur Index der Unterliste)
                                     // > + firstIndex + 1 um tatsächlichen Index herauszufinden
        	
        	if (secondIndex != -1) { //check if secondindex exists
                return String.format("%s, %s, %s", 
                		card,
                		cards.get(secondIndex),
                		cards.get(firstIndex) );
            }
        }
 
        if(cardCounter >= 12) {
        	System.out.println("Reset: "); 
        	reset();
        	Object result =  "No triplets found!";
        	return result;
        	 }
        return null; // keep compiler happy -> control flow
    }
 
//resets the lists cards, rank and sets counter to 0 
    @Override
    public void reset() {
        cards.clear();
        ranks.clear();
        cardCounter = 0;
    }
}