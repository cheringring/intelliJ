package CardHandOn;

public class CreditCard extends Card{
    private double tax;
    public CreditCard(int cardNumber, String limitDay) {
        super(cardNumber, limitDay);
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public void BuyTax(){
        var product = new Product();
       double tax =  product.getPrice() * 10;

    }
}
