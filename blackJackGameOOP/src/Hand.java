import java.util.ArrayList;

public class Hand {

    ArrayList<Card> cards;

    // Constructor
    public Hand(){
        cards = new ArrayList<Card>();
    }

    // Methods
    public void clear(){
        cards.clear();
    }

    public void add(Card card){
        cards.add(card);
    }

    public String showHand(){
        // show cards and their total points,
        // but only show total points if ALL cards are face up
        String str = "";
        boolean allFaceUp = true;
        for(Card card: cards){
            str += card.toString() + "\n";

            if(!card.isFaceUp){
                allFaceUp = false;
            }
        }

        // if all cards are face up, show total
        if(allFaceUp){
            str += "Total points : " + getTotal() + "\n";
        }
        return str;
    }

    // return the total points of a hand
    public int getTotal(){
        int totalPts = 0;
        boolean hasAce = false;

        // getting total points (any Aces by default will be worth 1)
        for(int i =0; i < cards.size(); i++){
            totalPts += cards.get(i).getRank();

            // check to see if the card is an Ace
            if(cards.get(i).printRank() == "Ace"){
                hasAce =true;
            }

            // Make Ace worth 11 if total points <= 11
            if(hasAce && totalPts <= 11){
                totalPts += 10; // add 10 to the Ace
            }

        }
        return totalPts;
    }

    public void flipCards(){
        for(Card card: cards){
            card.flipCard();
        }
    }

    public boolean give(Card card,Hand otherHand){
        if(!cards.contains(card)){
            return false;
        } else {
            cards.remove(card);
            otherHand.add(card);
            return true;
        }
    }
}
