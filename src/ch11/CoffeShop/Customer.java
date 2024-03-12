package ch11.CoffeShop;


// 아메리카노 3000원, 라떼 3500원, 초코 4500원
// 스타벅스라는 커피숍에만 회원 가입된 회원만 주문 가능.
// 회원가입 정보: 이름,나이,성별,자녀수
// 주문 받고 커피숍 이름과 주문정보 출력
public class Customer {

    String name;
    String sex;
    int age;
    int childCnt;

    public void setName(String name){
        this.name= name;

    }

    public void setAge(int age) {
        this.age= age;

    }

    public void setChildCnt(int childCnt) {
        this.childCnt = childCnt;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void printCustomerInfo(){
        System.out.println("이름: "+name+"나이: "+age+"성별: "+sex+"자녀 수: "+childCnt);

    }
}
