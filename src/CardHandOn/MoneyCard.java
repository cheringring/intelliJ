package CardHandOn;

public class MoneyCard extends Card{

    private int accountNum;

    public MoneyCard(int cardNumber, String limitDay,int accountNum) {
        super(cardNumber, limitDay);
        this.accountNum=accountNum;
    }

    public int getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(int accountNum) {
        this.accountNum = accountNum;
    }
}
