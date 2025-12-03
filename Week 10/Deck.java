//Name: Garrett Radtke
//Date: 12/1/2025

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<Card>();

    //constructor method
    public Deck() {
        for (int i = 0; i < 4; i++) { //makes for 13 cards of 4 suits
            for (int j = 0; j < 13; j++) {
                switch(i){
                    case 0:
                        deck.add(new Card("Heart", j+1));
                        break;
                    case 1:
                        deck.add(new Card("Diamond", j+1));
                        break;
                    case 2:
                        deck.add(new Card("Club", j+1));
                        break;
                    case 3:
                        deck.add(new Card("Spade", j+1));
                        break;
                }
            }
        }
    }

    //returns a card, then removes it from deck
    public Card deal() {
        Card card = deck.get(0);
        deck.remove(0);
        return card;
    }

    //shuffles deck
    public void shuffle() {
        Collections.shuffle(deck);
    }

    //prints deck to string for testing
    public void displayDeck() {
        int run = 0;
        for(Card card : deck){
            System.out.println(card.convertString());
            run++;
        }
        System.out.println(run);
    }
}
