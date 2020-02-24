package blackjack;
import java.util.*;
/**
 *
 * @author dot
 */
public class Player {
    private ArrayList<Card> hand;
    private int score;
    
    public Player()
    {
        hand = new ArrayList<Card>();
        score = 0;
    }
    
    public void addCard(Card inCard)
    {
        hand.add(inCard);
    }
    
    public int getScore()
    {
        for(int i = 0; i < hand.size(); i++)
        {
            score += hand.get(i).getValue();
        }
        return score;
    }
    
    public ArrayList getHand()
    {
        return hand;
    }
}
