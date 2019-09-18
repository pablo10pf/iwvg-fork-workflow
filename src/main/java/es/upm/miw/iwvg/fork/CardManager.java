package es.upm.miw.iwvg.fork;

import javax.smartcardio.Card;
import java.util.ArrayList;

public class CardManager {

    private ArrayList<Card> cards;

    public CardManager(ArrayList<Card> cards) {
        this.cards = cards;
    }
}
