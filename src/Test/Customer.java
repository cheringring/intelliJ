package Test;

import java.security.PublicKey;
import java.util.*;

public class Customer {
    private String name;
    private String nickname;
    private String email;

   public Customer(String name, String email){
       this.name= name;
       this.email = email;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(name, customer.name) && Objects.equals(email, customer.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        return "고객 명단: \n" +
                "이름: " + name + '\'' +
                ", 닉네임: '" + nickname + '\'' +
                ", 이메일: '" + email + '\'' +
                '\n';
    }
}

enum Menu {
    AMERICANO,
    CAFERATTE,
}

class CoffeShop{
    // 커피숍 객체 생성
    // 커피숍에 들어갈 속성은.. 일단 이름 구분해야하니까.

    private String name;

    private Map<Menu,Integer> menuPrice; // 메뉴 가격
    private Map<Customer,Integer> orderPrice; // 주문 가격
    private Set<Customer> customers;
    private int totalPrices;


    public CoffeShop(String name){
        this.name=name;

        menuPrice = new HashMap<>();
        orderPrice = new HashMap<>();
        customers = new HashSet<>();
    }

    // 필요한거 = 손님, 메뉴 가격

    // 셋팅해야 맵에 담고 셋에 담아서. 불러와서 쓸 수 있다.
    public void setCustomer( Customer customer){
        customers.add(customer);
        // Set에는 add
        // customer hashSet에 customer 때려박기.
    }
    public void setMenuPrice(Menu menu, int price){
        menuPrice.put(menu,price);
        // Map에는 put
    }

    // 여기서 메뉴 가격 불러와라.
    public Map<Menu,Integer> getMenus(){
        return menuPrice;
    }

    public void getOrderPrice(Customer customer,int amount){
        if (customers.contains(customer)){
            orderPrice.put(customer,amount);
            totalPrices += amount;


        }
        else System.out.println("비회원은 주문 불가합니다.");
    }

    public void printOrder(){
        for (var customer: orderPrice.keySet()){
            System.out.println(customer.getName()+"주문금액: " +
                    orderPrice.get(customer));

            // 키 값을 가져올때 get ~!!

        }
    }

    public int getTotalPrices(){
        return totalPrices;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeShop coffeShop = (CoffeShop) o;
        return Objects.equals(name, coffeShop.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}


// 일단 커피샵을 샵매니저에 셋 저장한다.
// 샵 매니저ㅁ
class ShopMgr{
    Set<CoffeShop> shops;
    // 밑에 줄 치기전에 오류뜸.

    public ShopMgr(){
    shops = new HashSet<>();
    }

    public void addShop(CoffeShop coffeShop){
        shops.add(coffeShop);
    }


}

