package blackjack;

import java.util.ArrayList;

public class ComparableCard extends Card implements Comparable<ComparableCard> {
    private ArrayList<String> suits = new ArrayList<String>();

    public ComparableCard(String inSuit, int inValue, String inName) {
        super(inSuit, inValue, inName);
        
        suits.add("diamonds");
        suits.add("clubs");        
        suits.add("hearts");
        suits.add("spades");
    }

    public int compareTo(ComparableCard card) {
        if (card == null) {
            throw new NullPointerException();
        } else if (card.getValue() > getValue()) {
            return 1;
        } else if (card.getValue() < getValue()) {
            return -1;
        } else {
            return 0;
        }
    }

    public boolean equals(ComparableCard card) {
        return card.getValue() == getValue();
    }
}