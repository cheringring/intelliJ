package ch14.Search;

import java.util.Objects;


// Customer는 RepositoryService를 통해 접근할 수 있다.
public class Customer {

    String name;
    String email;


//    사용자정보는 이름과 이메일을 포함하고 필수적인 정보는 이메일이다.
//    이름이 없는 경우 no name으로 표기된다.
    public Customer(String email){
        this(email,"no name");
        // 디폴트값정의. // 이메일만 입력하면 no name이 입력됨.
    }

    public Customer(String email,String name){
        this.email= email;
        this.name= name;
    }


    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    // 이메일이 같다면 사용자가 같다.

    @Override
    public boolean equals(Object ob) {
        return Objects.equals(this.email,((Customer)ob).email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email);
    }

    // 이렇게하면 이메일이 같으면 완벽하게 같다라는 걸 정의함.
    // hashCode, equals


}
