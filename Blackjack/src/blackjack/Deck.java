package blackjack;
import java.util.*;
/**
 *
 * @author dot
 */
public class Deck {
    private ArrayList<String> name;
    private ArrayList<String> suits;
    private ArrayList<Integer> values;
    private ArrayList<Card> deckOfCards;
    
    public Deck()
    {
        deckOfCards = new ArrayList<Card>();
        
        name = new ArrayList<String>();
        name.add("2");
        name.add("3");
        name.add("4");
        name.add("5");
        name.add("6");
        name.add("7");
        name.add("8");
        name.add("9");
        name.add("10");
        name.add("jack");
        name.add("king");
        name.add("queen");
        name.add("ace");
        
        suits = new ArrayList<String>();
        suits.add("diamonds");
        suits.add("clubs");        
        suits.add("hearts");
        suits.add("spades");
        
        values = new ArrayList<Integer>();
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        values.add(7);
        values.add(8);
        values.add(9);
        values.add(10);
        values.add(10);
        values.add(10);
        values.add(10);
        values.add(11);
        
        for(int i=0; i<52; i++) //assigns each card a rank, suit, and value
        { 
                deckOfCards.add(new Card(name.get(i%13),  values.get(i%13), suits.get(i%4)));      
        }
    }
    
    public ArrayList getDeck()
    {
        return deckOfCards;
    }
    
    public void swap(int first, int second)
    {
        Card temp = deckOfCards.get(first);
        deckOfCards.set(first, deckOfCards.get(second));
        deckOfCards.set(second, temp);
    }
    
    public void shuffle()
    {
        for(int i = 0; i < 100 ; i++)
        {
            swap((int)(Math.random()*52),(int)(Math.random()*52));
        }
    }
    
    public Card getTopCard()
    {
        Card temp = deckOfCards.get(0);
        deckOfCards.remove(0);
        return temp;
    }

}
