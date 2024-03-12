package ch11.CoffeShop;



//Q4. 스타벅스 커피숖에 메뉴가 3개가 있다.
//아메리카노 3000원, 라떼 3500원, 초코 4500원
// 단 주문을 하기위해서는 스타벅스에 회원가입된 회원만 가능하다.
//회원가입하기위한 정보는 이름, 나이, 성별, 자녀수정보가 필요하다.
//스타벅스 커피숖에 주문을 받고
//ex) James라는 사람이 스타벅스 커피숖에 가서 아메리카노를 주문했다.
//주문을 받은 정보(주문자정보, 주문메뉴와 가격, 주문날짜)를 출력하세요!
//

// 아메리카노 3000원, 라떼 3500원, 초코 4500원
// 스타벅스라는 커피숍에만 회원 가입된 회원만 주문 가능.
// 회원가입 정보: 이름,나이,성별,자녀수
// 주문 받고 커피숍 이름과 주문정보 출력

public class CoffeShop {

    static String name;
    String menu;
    int price;

    Customer[] customer = new Customer[10];

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public void printReceipt() {
        System.out.println("이름:" + name + ", 메뉴: " + menu + ", 가격: ");
    }
}

    // 스타벅스라는 커피숍에만 회원 가입된 회원만 주문 가능
    class Starbucks {

        public void IsMember(Customer customer){
            boolean isOk=false;

            }

//            public void IsMe


        }

