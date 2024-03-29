
public class Card {
	enum Suit{Club,Diamonds,Hearts,Spades};
	private Suit suit; //Definition: 1~4, Clubs=1, Diamonds=2, Hearts=3, Spades=4
	private int rank; //1~13
	/**
     * @param s suit
     * @param r rank
	 */
	public Card(Suit s,int r){		
		suit=s;
		rank=r;
	}	
		
	public void printCard(){
			
		String Rank;
		switch(rank){
			case 1:
				Rank="Ace";
				break;
			case 11:
				Rank="J";
				break;
			case 12:
				Rank="Q";
				break;
			case 13:
				Rank="K";
				break;
			default:
				Rank=Integer.toString(rank); 
	        }
			
		switch(suit){
			case Club:
			    System.out.println("Club,"+Rank);
			    break;
			case Diamonds:
			    System.out.println("Diamonds,"+Rank);
			    break;
			case Hearts:
			    System.out.println("Hearts,"+Rank);
			    break;
			case Spades:
			    System.out.println("Spades,"+Rank);
			    break;
			}
			
		}
	public Suit getSuit(){
		return suit;
	}
	public int getRank(){
		return rank;
	}
}



