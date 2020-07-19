/*
* Enumerated class has been used to create predefined items that non-alternate after
* */


public enum Suit {

    HEARTS("Hearts"),
    SPADES("Spades"),
    DIAMONDS("Diamonds"),
    CLUBS("Clubs");

    // Private field
    private final String suitText;

    // Constructor
    private Suit(String suitText){
        this.suitText = suitText;
    }

    // Public Method
    public String printSuit(){
        return suitText;
    }
}
