//Name: Garrett Radtke
//Date: 12/1/2025

public class Card {
    private String suit;
    private String name;
    private int value;

    //constructor
    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;

            switch (value) {
                case 1:  this.name = "Ace";   break;
                case 2:  this.name = "Two";   break;
                case 3:  this.name = "Three"; break;
                case 4:  this.name = "Four";  break;
                case 5:  this.name = "Five";  break;
                case 6:  this.name = "Six";   break;
                case 7:  this.name = "Seven"; break;
                case 8:  this.name = "Eight"; break;
                case 9:  this.name = "Nine";  break;
                case 10: this.name = "Ten";   break;
                case 11: this.name = "Jack";  break;
                case 12: this.name = "Queen"; break;
                case 13: this.name = "King";  break;
        }
    }

    //converts the card to a readable string
    public String convertString() {
        return String.format("%s of %ss", this.name, this.suit);
      
    }

    //getter for suit
    public String getSuit() {
        return this.suit;
    }

    //getter for name
    public String getName() {
        return this.name;
    }

    //getter for value
    public int getValue() {
        return this.value;
    }

}
