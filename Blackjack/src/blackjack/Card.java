package blackjack;

/**
 *
 * @author dot
 */
public class Card {
    private String suit;
    private int value;
    private String name;
    
    public Card(String inSuit, int inValue, String inName)
    {
        suit = inSuit;
        name = inName;
        value = inValue;
    }
    public String getSuit()
    {
        return suit;
    }
    public int getValue()
    {
        return value;
    }
    public String getName()
    {
        return name;
    }
    
    public void changeValue(int inValue)
    {
        value = inValue;
    }
    
    public String toString()
    {
        return suit + " of " + name;
    }
}
