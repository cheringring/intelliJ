package CardHandOn;

public class Card {

    protected int cardNumber;
    protected String  limitDay;
    protected int commision;


    public Card(int cardNumber,String limitDay) {
        this.cardNumber = cardNumber;
        this.limitDay = limitDay;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getLimitDay() {
        return limitDay;
    }

    public void setLimitDay(String limitDay) {
        this.limitDay = limitDay;
    }

}




