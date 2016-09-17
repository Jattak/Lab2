package pokerBase;

import java.util.Comparator;

import Enums.eRanks;
import Enums.eSuits;

public class Card {
	//Created the Attributes
	private eRanks rank;
	private eSuits suit; 
	
	public Card(eRanks rank, eSuits suit) {
		super();
		this.rank = rank;
		this.suit = suit;
	}

	public eRanks getRank() {
		return rank;
	}

	public eSuits getSuit() {
		return suit;
	}
	
}
