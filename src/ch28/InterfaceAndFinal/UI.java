package ch28.InterfaceAndFinal;


interface Flower {
    // final = 생성자 함수가 없기때문에 선언과 동시에 초기화해야됨.
    int age = 10;

}

interface Planet extends Flower{
    int age = 20;
}

class Tulip implements Planet{
  //   int age = 30; // 튤립의 인스턴스 변수
}

public class UI {
    public static void main(String[] args) {
        Tulip tulip = new Tulip();
        System.out .println(tulip.age);
        // 튤립에 age가 없기때문에 부모껄로 올라감.



    }
}
