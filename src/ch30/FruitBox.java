package ch30;

import java.util.ArrayList;
import java.util.List;

public class FruitBox<T> {

    List<T> fruits = new ArrayList<>();

    public void add(T fruit){
        fruits.add(fruit);
    }
}

class Fruit{}

class Apple{
    private int color= 1;

}
class Main{
    public static void main(String[] args) {
        var intBox = new FruitBox<Integer>();
        // FruitBox에 기본형타입안됨. Integer 같은
        // Int class 형 자료형을 써야됨.

        intBox.add(12);

        var appleBox = new FruitBox<Apple>();
        List<Apple> apples= new ArrayList<>();

        // 다형성도 적용된다.

        var fruitBox = new FruitBox<Fruit>();
      //  fruitBox.add(new Apple());

    }
}