package es.upm.miw.iwvg.fork;

import java.util.Date;

public class Card {

    private int number;
    private Date expiration;
    private int cvv;

    public Card(int number, Date expiration, int cvv) {
        this.number = number;
        this.expiration = expiration;
        this.cvv = cvv;
    }
}
