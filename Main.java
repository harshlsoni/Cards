// Main.java - Implements menu-driven program
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();

        while (true) {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Card");
            System.out.println("3. Cards of Same Suit");
            System.out.println("4. Cards of Same Rank");
            System.out.println("5. Find a Card");
            System.out.println("6. Deal 5 Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    deck.printDeck();
                    break;
                case 2:
                    System.out.print("Enter card index (0-51): ");
                    int index = scanner.nextInt();
                    deck.printCard(index);
                    break;
                case 3:
                    System.out.print("Enter suit (Hearts, Diamonds, Clubs, Spades): ");
                    String suit = scanner.nextLine();
                    deck.sameCard(suit);
                    break;
                case 4:
                    System.out.print("Enter rank (2-10, Jack, Queen, King, Ace): ");
                    String rank = scanner.nextLine();
                    deck.compareCard(rank);
                    break;
                case 5:
                    System.out.print("Enter suit: ");
                    String fSuit = scanner.nextLine();
                    System.out.print("Enter rank: ");
                    String fRank = scanner.nextLine();
                    deck.findCard(fSuit, fRank);
                    break;
                case 6:
                    deck.dealCard();
                    break;
                case 7:
                    deck.shuffleDeck();
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
