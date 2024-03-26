package CardHandOn;


import java.util.ArrayList;
import java.util.List;

public class MyCard {

    private List<Card> cards;

    public MyCard(){
        cards = new ArrayList<>();

    }

    public List<Card> getDevices() {
        return cards;
    }

    public void addMyCard(Card card){
        cards.add(card);

    }

}
