package ch18.handson;
//
//대략 업무를 정의하자면
//1.센터에서 커피숍을 관리하고
//2. 센터에 등록된 각 커피숍들은 고정메뉴 ‘아메리카노’,’카페라떼’메뉴를 가집니다.
//        3. 각 메뉴의 가격은 입점 커피숍들이 설정 가능하다고 하네요.
//        4. 입점 커피숍들은 주문 내역과 총 판매금액을 알 수 있게 요청이 들어왔습니다.
//5. 주문 내역은 주문자명과 주문금액정도면 될 것 같습니다.
//6. 주문ㅇ르 하기 위해서는 회원가입된 회원만 가능하고
//7. 회원가입을 하기위해서는 이름과 이메일은 필수 이며
//그 외 주소와 닉네임은 옵션으로 처리 요망.
//8. 닉네임을 미 설정시 사용자 이름으로 표기 요망.

import java.util.*;

public class Customer {
    // 기본으로 은닉시켜야함.
    private String email;
    private String name;
    private String addr;
    private String nickname;

    public Customer(String email, String name){
        this.name= name;
        this.email=email;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddr() {
        return addr;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    // 동일한 객체가 생성되면 안되니까
    // equals랑 hashcode 선언
    @Override
    public boolean equals(Object o) {
        Customer customer = (Customer) o;
        return Objects.equals(email, customer.email)
                && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email,name);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }

}

//2. 센터에 등록된 각 커피숍들은 고정메뉴
// ‘아메리카노’,’카페라떼’메뉴를 가집니다.
// 이넘에는 setter 제공 x
enum Menu {
    AMERICANO,
    CAFERATTE,

}
//

//3. 각 메뉴의 가격은 입점 커피숍들이 설정 가능하다고 하네요.
//4. 입점 커피숍들은 주문 내역과 총 판매금액을 알 수 있게 요청이 들어왔습니다.

class CoffeShop {

    private String name;

    // 메뉴 가격
    private Map<Menu, Integer> menuPrices;
//
//    Integer는 자바에서 제공하는 클래스로, 정수를 감싸는
//    래퍼 클래스(Wrapper Class)입니다.

    // Map은 키와 벨류로 이루어져있음
    // Menu가 key이고 , Integer가 벨류임.
    // 여기에 들어가는 애들은 객체만 가능함. Menu= enum객체
    // <> <- 제너릭 , 타입을 쑤셔박을 수 있다.


    //    5. 주문 내역은 주문자명과 주문금액정도면 될 것 같습니다.
    private Map<Customer, Integer> customerOrders;
// 주문자 명을 Customer, 주문 금액을 Integer 타입으로 반환.
    // 주문자 명은 중복될 수 있으니까. String 말고 Customer안에 있는
    // name으로 반환하는게 안전.
    // 같은 고객이 여러번 주문할테니까 여기서 맵은 적절하지 않다.


    // order객체 만들어서 배열로 처리하셈 다시.

    private Set<Customer> customers;

//    여러 고객 관리의 용이.고객들의 정보를 저장하고 접근할 수 있어야 합니다.
//    customers라는 Set을 사용하여 이를 관리합니다.
//    중복 방지: Set은 중복된 요소를 허용하지 않는 자료구조입니다.
//    따라서 customers 집합에는 같은 고객이 중복해서 포함되지 않습니다.
//    검색 및 조회: Set은 빠르게 요소를 검색할 수 있는 자료구조입니다.
//    따라서 고객의 이메일이나 이름 등을 기준으로 고객을 조회하거나 검색할 때 유용합니다.
//    고객 목록 유지: 커피숍은 고객들의 정보를 유지하고 필요한 경우 조회할 수 있어야 합니다.
//    customers 집합을 사용하여 고객 목록을 관리하면 이를 손쉽게 할 수 있습니다.
//
    private int totalSales; // 총 판매금액.


    // Map은 구현체가 없기떄문에(Set과 동일)
    // hashMap을 통해 만들어야됨.


    // 입점 커피숍 여러가지를 표현
   public CoffeShop(String name) {

        this.name = name;

        menuPrices = new HashMap<>();
        customerOrders = new HashMap<>();
        customers = new HashSet<>();

        // new라는 연산자를 통해 메모리에 할당. new 하면 해쉬맵에
        // 전에 생성했던 맵 변수에다가 묵시적으로 할당이 돼서
        // <> 부분에 안적어도됨.
    }

    public void setCustomer(Customer customer) {
        customers.add(customer);
    }

    public void setMenuPrice(Menu menu, int price) {
        menuPrices.put(menu, price);
    }

    public Map<Menu, Integer> getMenus() {
        return menuPrices;
    }

    public void makesale(Customer customer, int amount) {
        if (customers.contains(customer)) { // contains : 자기가 받은 객체에
            // 똑같은 객체가 있는지 확인하는 메소드
            // 자신이 저장되어있는 customer 객체들과 객체들의 해쉬코드와
            // 넘긴 해쉬코드가 같으면 true  =  customer:  name,email

            // 회원만 주문 가능
            customerOrders.put(customer, amount);
            // 키 값을 넣는다.
            totalSales += amount;

        } else System.out.println("비회원은 주문 불가합니다.");
    }
    // 주문 내역 출력

    public void printOrder() {
        // keySet() 의 타입은 Set이다 = 중복을 허용하지않음.
        // 키셋을 통해 커스터머 오더의 키값을 받아올 수 있다.
        // == Customer

        // 위에  customerOrders.put(customer, amount); 의 key customer

        for (var customer : customerOrders.keySet()) {
            System.out.println(customer.getName() + "주문 금액: "
                    + customerOrders.get(customer)); // < 해당고객이 주문한 가격
        }
    }

    public int getTotalSales() {
        return totalSales;
    }

    // 같은 커피숍인걸 알기 위해.
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


// 샵 매니지먼트
class ShopMgr {

    Set<CoffeShop> shops;

    public ShopMgr() {
        shops = new HashSet<>();
    }

    public void addShop(CoffeShop coffeShop) {
        shops.add(coffeShop);
    }

    public Set<CoffeShop> allShop() {
        return shops;
    }
}
// 순서대로 쭉 따라오면 이해가 간다.


    class Main {
        public static void main(String[] args) {

            //center
            var center = new ShopMgr();

            // shop
            var shop = new CoffeShop("starbucks");
            center.addShop(shop);
            shop.setMenuPrice(Menu.AMERICANO, 3000);
            shop.setMenuPrice(Menu.CAFERATTE, 4000);

            //customer
            var customer = new Customer("kavin@gmail.com", "kavin");

            // login후에 등록된 shop의 등록된 리스트를 보여준다.
            var shops = center.allShop();
            // 센터에 등록된 샵들.

            CoffeShop findshop = null;

            // shop은 CoffeShop의 "starbucks"이다.
            for (var s : shops) {
                if (s.equals(shop)) {
                    findshop = s; // findshop에 s를 집어넣는다.
                    break;
                }
            }
            // 찾은 샵의 메뉴 리스트.
            var menus = findshop.getMenus();

            //고객이  아메리카노를 주문했다면

            findshop.makesale(customer, menus.get(Menu.AMERICANO));
            findshop.makesale(customer, menus.get(Menu.CAFERATTE));
            findshop.printOrder();
        }
    }


