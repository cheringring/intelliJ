package ch18.house;

public class HouesPark {
    String lastname = "park";


    public static void main(String[] args) {
        var kim = new HouseKim();
        // defalut접근 제어 지시자는 같은패키지 House에서만 참조 가능
        kim.lastname = "kkk";
        System.out.println(kim.lastname);
    }

}
