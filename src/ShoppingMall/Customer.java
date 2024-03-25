package ShoppingMall;

import java.util.Objects;


public class Customer {
    protected static String ID;
    protected static String name;
    protected static String grade;


    // 비회원일경우.

    public Customer(String ID, String name,String grade){
        this.ID=ID;
        this.name=name;
        this.grade = grade;

    }
    public Customer(String ID){
        this(ID,"null",null);
    }


    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getGrade() {
        CustomerGrade customerGrade = new CustomerGrade();
        return customerGrade.grade;
    }

    public static void setGrade(String grade) {
        CustomerGrade.grade = grade;
    }

    // id 중복방지.
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(ID, customer.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }

    @Override
    public String toString() {
        return "고객" +
                "ID: '" + ID + '\n' +
                "이름: " + name + '\n' +
                "등급: "+ grade ;
    }
}
//
//class RoyalCustomer {
//
//    private int discount;
//    private int bonus;
//
//
//    private Customer customer;
//    public RoyalCustomer(Customer customer){
//        this.customer=customer;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//    public void BuyDiscount(Shop.Product product, double PdDiscount){
//        int price = product.getPrice();
//        PdDiscount = price- (price * 0.05);
//
//
//        System.out.println(customer.getID()+"\n 구입한 상품: "+product.getName()+"\n 가격(-5%):  "+ PdDiscount+"원" );
//    }
//
//    public void addBonus(Shop.Product product, double PdBonus){
//        int price = product.getPrice();
//        PdBonus = price *0.05;
//    }
//}
//
//
//class NormalCustomer{
//
//
//    private int discount;
//    private int plusBonus;
//
//    private Customer customer;
//
//    public NormalCustomer(Customer customer){
//        this.customer=customer;
//    }
//
//    public Customer getCustomer() {
//        return customer;
//    }
//
//    public void setCustomer(Customer customer) {
//        this.customer = customer;
//    }
//
//

