package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.UUID;

public class Hand {
	//Constructor for hand
	public Hand(){}
	
	
	private ArrayList<Card> hand = new ArrayList<Card>();
	//TODO add card to the hand using function
	public Hand Add(){
		int[] hand = new int[5]; 
		int x = 0;
		for (int j = 1;j<=5;j++){
		    hand[x] = j;
		    x++;
		}
	}
}
	//TODO sort hand by rank (not required)
	//TODO evaluate hand
	//TODO evaluate a group of hands
