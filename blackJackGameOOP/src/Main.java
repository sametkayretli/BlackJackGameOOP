public class Main {

    public static void main(String[] args) {



        // Create a deck
        Deck d1 = new Deck();
        d1.populate();
        d1.shuffle();


        // create our playing hands
        Hand h1,h2,h3, dealer;
        h1 = new Hand();
        h2 = new Hand();
        h3 = new Hand();
        dealer = new Hand();
        Hand[] hands = {h1, h2, h3};

        // deal cards to our hands
        d1.deal(hands, 3); // two cards per hand

        // deal 2 cards to dealer
        d1.deal(dealer, 3);

        // show the players' hand
        for(int i = 0; i < hands.length; i++){
            hands[i].flipCards();
            System.out.println(hands[i].showHand());
        }

        // flip the dealer's first hand
        dealer.cards.get(0).flipCard();

        // show the dealer's cards
        System.out.println("\nDealer's Cards: \n" + dealer.showHand());
        

    }
}
