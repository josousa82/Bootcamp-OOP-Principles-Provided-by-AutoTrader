package cards;

import java.util.ArrayList;
import java.util.Collections;

public class SuperDeck implements Deck {

    private ArrayList<Card> superDeck;


    public SuperDeck() {

        superDeck = new ArrayList<>();
        AnimalDeck animalDeck = new AnimalDeck();
        PlayingCardDeck playingCardDeck = new PlayingCardDeck();

        while (animalDeck.getCards().length > 0 ){
            superDeck.add(animalDeck.deal());
        }

        while (playingCardDeck.getCards().length > 0 ){
            superDeck.add(playingCardDeck.deal());
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(superDeck);
    }

    @Override
    public String[] getCards() {
        String[] result = new String[superDeck.size()];
        for (int i = 0; i < superDeck.size(); i++) {
            Card card = superDeck.get(i);
            result[i] = card.toString();
        }
        return result;
    }

    @Override
    public Card deal() {
        return superDeck.remove(0);
    }

   }

