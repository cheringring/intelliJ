package Card;

import java.util.Date;

enum CardType {
    CRDIT(0.1,0.05),
    CASH(0.0,0.03),
    GIFT(0.0,0.01);

    private double tax;
    private double fee;

    CardType(double tax, double fee){
        this.tax=tax;
        this.fee = fee;
    }
    public double getTax(){
        return tax;
    }
    public double getFee(){
        return fee;
    }

    public double creditTax(int price){
        double tax = price * CRDIT.getTax();

        return tax;
    }

    public double crditFee(int price){
    double totalFee = price* CRDIT.getFee();

    return totalFee;
}

public double cashFee(int price){
    double totalFee = price* CASH.getFee();

    return totalFee;

}


}



public class User {
    private Long idx;
    private String email;
    private static int buy;

    public User(Long idx,String email){
        this.idx = idx;
        this.email=email;
    }

    public Long getIdx() {
        return idx;
    }

    public void setIdx(Long idx) {
        this.idx = idx;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getBuy() {
        return buy;
    }

    public void setBuy(int buy) {
        this.buy = buy;
    }

    @Override
    public String toString() {
        return "Card.User{" +
                "idx=" + idx +
                ", email='" + email + '\'' +
                '}';
    }
}

class TransactionData{
    private Date date;
    private double price;

    public TransactionData(Date date, double price){
        this.date=date;
        this.price=price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Card.TransactionData{" +
                "date=" + date +
                ", price=" + price +
                '}';
    }
}

