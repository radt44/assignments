//Name: Garrett Radtke
//Date: 12/1/2025

import java.util.Scanner;

public class CardGame {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Starting Blackjack Game Setup ---");
        Player player = new Player(500);
        Player dealer = new Player(0);
        System.out.println("-------------------------------------");
        boolean next = true;
        while (next) { //basic game loop
            if (player.checkBalance() > 0) {
                System.out.println("Your balance is: $" + player.checkBalance() + ". How much do you want to wager?");
                int wager = 9999999;
                while (wager > player.checkBalance()) { //makes sure player cant exceed bet
                    wager = input.nextInt();
                    if (wager > player.checkBalance()) {
                        System.out.println("Enter a wager that doesn't exceed your balance.");
                    }
                }
                player.changeBalance(playGame(player, dealer, wager));
                player.clearHand();
                dealer.clearHand();
                System.out.println("Play again? (true/false)");
                next = input.nextBoolean(); //restarts loop
            } else {
                System.out.println("You lost all your money.");
            }
        }
        System.out.println("Ended with $" + player.checkBalance());
    }

    public static int playGame(Player player, Player dealer, int wager) {
        Scanner input = new Scanner(System.in);
        Deck deck = new Deck();
        deck.shuffle();
        player.addCard(deck.deal());
        player.addCard(deck.deal());
        dealer.addCard(deck.deal());
        dealer.addCard(deck.deal());
        int playerTotal = Integer.parseInt(player.calculateHand()[0]);
        int dealerTotal = Integer.parseInt(dealer.calculateHand()[0]);

        if (playerTotal == 21 && dealerTotal == 21) {
            System.out.println("Tie with dealer! Wager returned.");
            return 0;
        } else if (playerTotal == 21) {
            System.out.println("Blackjack! You win.");
            return (int) (wager * 2);
        } else if (dealerTotal == 21) {
            System.out.println("Dealer has blackjack! You lose.");
            return -wager;
        }

        // player turn
        int turn = 0;
        while (true) {
            System.out.println("Dealer has (" + dealer.calculateFirst() + "): ");
            dealer.displayFirst();
            System.out.println(" + 1 card");
            System.out.println("You have (" + playerTotal + "): ");
            player.displayHand();
            if (turn == 0 && player.checkBalance() >= wager * 2) { //double down if first turn and player can afford
                System.out.println("Hit, Stand, or Double Down? (H/S/D)");
            } else {
                System.out.println("Hit or Stand? (H/S)");
            }
            String choice = input.nextLine().trim().toUpperCase();
            if (choice.equals("H")) { //logic for hit
                Card newCard = deck.deal();
                player.addCard(newCard);
                System.out.println("You drew: " + newCard.convertString());
                player.displayHand();
                playerTotal = Integer.parseInt(player.calculateHand()[0]);
                if (playerTotal > 21) {
                    System.out.println("Bust! You lose.");
                    return -wager;
                } else if (playerTotal == 21){
                    System.out.println("You win! $" + wager * 2 + " added to balance.");
                    return wager * 2;
                }
            } else if (choice.equals("S")) { //break if stand
                break;
            } else if (choice.equals("D") && turn == 0) { //same as hit logic but doubles wager and breaks
                wager = wager * 2;
                Card newCard = deck.deal();
                player.addCard(newCard);
                System.out.println("You drew: " + newCard.convertString());
                player.displayHand();
                playerTotal = Integer.parseInt(player.calculateHand()[0]);
                if (playerTotal > 21) {
                    System.out.println("Bust! You lose.");
                    return -wager;
                } else if (playerTotal == 21) {
                    System.out.println("Blackjack! S" + wager * 2 + " added to balance.");
                    return wager * 2;
                }
                break;
            }
            System.out.println("-------------------------------------");
        }

        // dealers turn
        if (true) {
            System.out.println("Dealer's hand:");
            dealer.displayHand();
            dealerTotal = Integer.parseInt(dealer.calculateHand()[0]);
            while (dealerTotal < 17 && dealer.calculateHand()[1] == "true") { //while dealer hand is below 17 and a soft hand
                Card newCard = deck.deal();
                dealer.addCard(newCard);
                System.out.println("Dealer draws: " + newCard.convertString());
                dealerTotal = Integer.parseInt(dealer.calculateHand()[0]);
                System.out.println("Dealer has (" + dealerTotal + "): ");
                dealer.displayHand();
                System.out.println("-------------------------------------");
            }

            // Determine winner
            if (dealerTotal > 21 || playerTotal > dealerTotal) { //if dealer busts or player has a better hand
                System.out.println("You win! S" + wager * 2 + " added to balance.");
                return wager * 2;
            } else if (dealerTotal > playerTotal) { //if dealer wins
                System.out.println("Dealer wins!");
                return -wager;
            } else {
                System.out.println("Tie game!");
                return 0;
            }
        }
        return wager;
    }
}
