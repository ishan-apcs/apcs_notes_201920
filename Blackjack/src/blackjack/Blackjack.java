package blackjack;

/**
 *
 * @author dot
 */
public class Blackjack {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Deck playingCards = new Deck();
        System.out.println(playingCards.getDeck());
        playingCards.shuffle();
        System.out.println(playingCards.getDeck());
        
        Player Andy = new Player();
        Andy.addCard(playingCards.getTopCard());
        Andy.addCard(playingCards.getTopCard());
        System.out.println(Andy.getHand());
        System.out.println(playingCards.getDeck());
        System.out.println(Andy.getScore());
    }
}
