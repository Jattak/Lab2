package Enums;

public enum eRanks {
	//Gives you the Variable(what is is worth)
	Two(2), Three(3), Four(4), Five(5), Six(6), Seven(7), Eights(8), Nine(9), Ten(10), Jack(11), Queen(12), King(13), Ace(14);
	
	private int rankNumber;
	
	//Enums variables are always private
	private eRanks(int rankNumber){
		this.rankNumber = rankNumber;
	}

	public int getRankNumber() {
		return rankNumber;
	}
	
}
