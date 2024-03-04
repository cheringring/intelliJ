package ch03;

public class Product {
    public static void main(String[] args) {

        final double VAT_RATE= 0.1;
        //double productPrice = 1000 * VAT_RATE;
        var totalPrice = Product.productPrice(1000,EVARate.VAT_10);
        System.out.println((int) totalPrice);

    }

    public static double productPrice(double price, EVARate rate) {
        var vat = price * rate.getTax();
        return price + vat;
        // 변수에 담지말고 그냥 리턴으로 담는게 더 편하다.
    }
}

class VATRate{
    public static final VATRate VAT_RATE = new VATRate(0.1);
    double tax;

    VATRate(double tax){
        //생성자함수,클래스명이랑 똑같음.
        this.tax = tax;

    }
    public double getTax(){
        return tax;
    }
}

