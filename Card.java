// card.java

class Card {
	String ranks;
	String suits;

	public Card(String ranks, String suits) {
		this.ranks = ranks;
		this.suits = suits;
	}

	public String toString() {
		return ranks + " of " + suits;
	}


}