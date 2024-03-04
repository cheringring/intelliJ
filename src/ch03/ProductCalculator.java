package ch03;

public class ProductCalculator {
    public static void main(String[] args) {

        final double TAX = 0.1;
        var product= 1000;
        var productCal= product * TAX;
        var product_Tax = product+productCal;
        System.out.println((int)product_Tax);
    }
}
