public class Card {

    // Private Fields
    private Suit suit;
    private Rank rank;
    public boolean isFaceUp;

    // Constructor Method
    public Card(Rank rank, Suit suit){
        this.rank = rank;
        this.suit = suit;
        //this.isFaceUp = false;
    }

    // Public Methods
    public String getSuit(){
        return suit.printSuit();
    }

    public int getRank(){
        return rank.getRank();
    }

    public String printRank(){
        // get rank as a string( primarily for Aces)
        return rank.printRank();
    }

    public void flipCard(){
        isFaceUp = !isFaceUp;
    }

    public String toString(){
        String str = "";
        if(isFaceUp){
            str += rank.printRank() + " of " + suit.printSuit();
        } else {
            str = "Face Down (nothing to see here)";
        }
        return str;
    }
}
