//Name: Garrett Radtke
//Date: 12/1/2025

import java.util.ArrayList;
import java.util.Comparator;

public class Player {
    private int balance;
    private ArrayList<Card> hand;

    //constructor method
    public Player(int balance) {
        this.balance = balance;
        this.hand = new ArrayList<Card>();
    }

    //calculates the value of hand
    public String[] calculateHand() {
        int sum = 0;
        String isSoft = "true";
        hand.sort(Comparator.comparingInt(Card::getValue).reversed()); //sorts in descending value so ace is last
        for (Card card : this.hand) {
            switch(card.getName()) {
                case("Ace"): //ace is 11 unless hand would bust
                    if (sum + 11 > 21) {
                        sum = sum + 1;
                        isSoft = "false"; //hard hand if ace must be 1
                }    else sum = sum + 11;
                    break;
                case("Jack"):
                    sum = sum + 10;
                    break;
                case("Queen"):
                    sum = sum + 10;
                    break;
                case("King"):
                    sum = sum + 10;
                    break;
                default:
                    sum = sum + card.getValue();
                    break;
            }
        }
        return new String[]{Integer.toString(sum), isSoft};
    }

    //displays first card for dealer logic
    public void displayFirst() {
        Card card = this.hand.get(0);
        System.out.println(card.convertString());
    }

    //calculates the value of first card for dealer logic
    public int calculateFirst() {
        Card card = hand.get(0);
        int sum = 0;
        switch(card.getName()) {
                case("Ace"):
                    if (sum + 11 > 21) {
                        sum = sum + 1;
                }    else sum = sum + 11;
                    break;
                case("Jack"):
                    sum = sum + 10;
                    break;
                case("Queen"):
                    sum = sum + 10;
                    break;
                case("King"):
                    sum = sum + 10;
                    break;
                default:
                    sum = sum + card.getValue();
                    break;
            }
        return sum;
    }

    //adds card to hand
    public void addCard(Card card){
        hand.add(card);
    }

    //clears the hand
    public void clearHand() {
        hand.clear();
    }

    //displays the hand
    public void displayHand() {
        int run = 0;
        for(Card card : this.hand) {
            System.out.println(card.convertString());
            run++;
        }
    }


    //returns balance
    public int checkBalance() {
        return this.balance;
    }

    public void changeBalance(int change) {
        this.balance = balance + change;
    }
}
