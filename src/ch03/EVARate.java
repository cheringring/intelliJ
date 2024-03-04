package ch03;

public enum EVARate {
    // enum < 상속 클래스
// pubilc static final EVARate VAT_10 = new EVARate(0.1);
    // 이랑 같은 의미이다.

    VAT_10(0.1);

    double tax;
    EVARate(double tax){
        this.tax = tax;
    }
    public double getTax() {return tax;}
}
