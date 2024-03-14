package ch14.Search;

import ch14.Search.Customer;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;


// 이건 전부 다 인스턴스 변수가 아니다.
// static = 클래스 메소드
// 누군가 상속을 하지 못하게. final을 붙인다 : 재정의하면안되니까.
final class Repository {

    private static Set<Customer> db;
    // static만 하면 모든 클래스에서 Repository. ~ 이렇게 가져올 수 있다.

    static {

        db= new HashSet<>();
        // add는 db에 정보를 넣는다는 말.
        // Customer를 new Customer로 객체를 불러와 db에 저장.
        db.add(new Customer("kavin@naver.com")); // 이건 no name으로 표기.
        db.add(new Customer("steve@gmail.com","steve"));
        //블록에서 db초기화
        // static 블록은 빠르게 읽어오기 위해 쓴다.
        // 왜 HashSet을 써야할까?
        // = Set은 불완전해서 기본적인 메카니즘을 Set에다가 저장해놓고
        // HashSet이 기본적인 Set 메카니즘을 구현함.
        // HashSet = Set의 자료구조
        // 자바에서 메모리를 처리하는 기법이 해싱 기법을 쓰고 있기때문에
        // 해쉬가 앞에 붙어있는 것이다.

        // 해쉬 셋은 셋을 구현하는 구현체고 객체라서 new를 써야하고
        // 객체를 저장할 수 있는 자료구조여서 반드시 객체 타입만 올 수 있다.
        // Set = 중복저장 x 인덱싱이 안됨.

    }

    public static void addCustomer(String email){
        db.add(new Customer(email));

    }
    public static void addCustomer(String email,String name){
        db.add(new Customer(email,name));

    }

    // db안에는 Customer 객체가 있음.
    // 여기는 일관성있게 String으로 가는 게 나음.= contains못씀.
    public static Customer findCustomer(String email) {
        for (var customer : db){ // db에 하나씩 빼와서 customer 객체에 넣는다.
            if (Objects.equals(email,customer.email)) return customer;
        }
        return null;
    }
}