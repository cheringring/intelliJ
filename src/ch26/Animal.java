package ch26;

import java.util.List;

public class Animal {
    protected void move(){
        System.out.println("Animal move");
    }
}

 class Human extends Animal {

    @Override
    public void move(){
        super.move();
    }
    // 부모의 접근제어지시지와 같거나 크면됨.

 }
 class Lion extends Animal{

    public int age;

     @Override
     public void move() {
         System.out.println("Lion move");
     }
     public void hunting(){
         System.out.println("Lion hunting");
     }
 }
 class Main{
     public static void main(String[] args) {
         Human human = new Human();
         Animal animal = new Lion();
        var main = new Main();
        main.move(human);
        main.move(animal);

         //  Lion lion = (Lion)(new Animal());  <이렇게 하면 사망.
     }

     // 다형성 . human의 move가 호출된다.
     public void move(Animal animal){
         animal.move();
         // 묵시적 형변환. 업캐스팅

         // 이거 하는 이유 : 만약 animal이라고 하면
         // 인간이 하는지, 사자가 하는지 모르기때문.
         if(animal instanceof Lion){
             ((Lion)animal).hunting();
         }

     }
 }
