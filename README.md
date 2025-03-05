# Deck of Cards - Java Project

## Project Overview
This project implements a menu-driven Java application to simulate a standard deck of 52 playing cards. Each card has one of four suits and one of 13 ranks. The program provides various operations to manipulate and interact with the deck using an **ArrayList** or **Vector** to store the deck of card objects.

## Features
The program supports the following features:

1. **Create Deck (`createDeck`)**
   - Initializes a standard deck of 52 playing cards.
2. **Print Deck (`printDeck`)**
   - Displays all the cards in the deck.
3. **Print Card (`printCard`)**
   - Prints a specific card given its rank and suit.
4. **Same Suit Cards (`sameCard`)**
   - Prints all cards that belong to the same suit as the specified card.
5. **Compare Cards (`compareCard`)**
   - Compares two cards and checks if they have the same rank.
6. **Find Card (`findCard`)**
   - Searches for a specific card in the deck.
7. **Deal Cards (`dealCard`)**
   - Draws and prints five random cards from the deck.
8. **Shuffle Deck (`shuffleDeck`)**
   - Randomizes the order of cards in the deck.

## Folder Structure
```
DeckOfCardsProject
│
├── src
│   ├── Main.java             # Main menu-driven program
│   ├── Card.java             # Class representing a single card
│   ├── Deck.java             # Class representing the deck of cards
│
├── README.md                 # Project documentation
```

## Setup and Execution
1. Clone this repository or download the project files.
2. Open the project in your favorite IDE (like VS Code, IntelliJ IDEA, or Eclipse).
3. Ensure you have a JDK (Java Development Kit) installed and configured.
4. Compile and run the `Main.java` file.
5. Follow the on-screen menu to interact with the deck.

## Coding Guidelines Followed
- Proper class and method separation.
- Each operation is a separate function.
- Use of meaningful variable and method names.
- Clear and concise inline comments explaining each block of logic.
- Consistent indentation and coding style.
