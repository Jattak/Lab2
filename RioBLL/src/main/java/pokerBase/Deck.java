package pokerBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import Enums.eRanks;
import Enums.eSuits; //Imports Ranks with Control + Shift + 0

public class Deck  {
	//Deck Variables
	
	ArrayList<Card> deck = new ArrayList<Card>();
	
	public Deck() {
		for (eRanks rank:eRanks.values()){
		for (eSuits suit:eSuits.values()){
			deck.add(new Card(rank,suit));
		}}
	}
	
	//Shuffle the deck, make a functions
	public Deck Arrange() { //Its suppose to take in a deck
		return deck.sort();
	}
	
	//Get cards from the deck 
	public Card Draw(){
		return deck.remove(0);
		
	}
}