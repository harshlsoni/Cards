//Deck.java

import java.util.*;
class Deck{
	ArrayList<Card> deck;

	public Deck(){
		this.deck = new ArrayList<>();
	}

	public void createDeck() {
		String[] ranks = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};
		String[] suits = {"Clubs","Diamonds","Hearts","Spades"};
	

		for (String rank : ranks) {
			for(String suit : suits) {
				deck.add(new Card(rank,suit));
			}
		}
	}

	public void displayDeck() {
		for (Card card: deck) {
			System.out.println(card);
		}
	}

	public void shuffleDeck() {
		Collections.shuffle(deck);
	}

	public void randomCards() {

		Random random = new Random();
        	int index1 = random.nextInt(deck.size());  // Pick first random index
        	int index2;

        	// Ensure the second index is different from the first
        	do {
            		index2 = random.nextInt(deck.size());
        	} while (index2 == index1);

       		System.out.println("First Random Card: " + deck.get(index1));
        	System.out.println("Second Random Card: " + deck.get(index2));		
	}

	public void players() {
	
		Card a[] = new Card[5];
		Card b[] = new Card[5];
		Card c[] = new Card[5];

		for (int i = 0;i<5;i++) {
			a.add(deck.get(i));
		}

		for (i:5) {
			a.add(deck.get(i));
		}
	}



}