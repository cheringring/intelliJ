package ShoppingMall;

import java.util.List;

class CustomerGrade {

    private static String grade;
    private List<Customer> customers;
    private int discount;
    private int bonus;
    private int point;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public void RoyalBuyDiscount(Product product) {
        int price = product.getPrice();
        double discount = price - (price * 0.05);

        System.out.println(customer.getID() + ":" + customer.getName() + "\n 구입한 상품: " + product.getName() + "\n 가격(-5%):  " + discount + "원");
    }

    public void RoyalAddBonus(Product product) {
        int price = product.getPrice();
        double point = price * 0.05;
        System.out.println(customer.getName() + "의 고객님의 포인트 적립은 " + point + "원 (충성 고객 우대+5%) 입니다.");

    }


    public void NormalBuyDiscount(Product product) {
        int price = product.getPrice();
        double PdDiscount = price - (price * 0.01);

        System.out.println(customer.getID() + ":" + customer.getName() + "\n 구입한 상품: " + product.getName() + "\n 가격(-1%):  " + PdDiscount + "원");
    }

    public void NormalAddBonus(Product product) {
        int price = product.getPrice();
        double point = price * 0.01;

        System.out.println(customer.getName() + "고객님의 포인트 적립은 " + point + "원 입니다.");

    }
}

    // 일반회원 누적 포인트
//    public void NormalCustomer() {
//
//
//
//
//    }
//
//    // 충성 고객 누적 포인트
//
//    public void RoyalCustomer(){
//
//
//    }
//
//
//
//}