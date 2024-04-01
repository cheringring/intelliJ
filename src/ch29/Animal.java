package ch29;

public class Animal {

    public void move(){
        System.out.println("move on ");
    }
}

class Creature{
    public void method(Animal dog){
        dog.move();
    }
}

class AppUI {
    public static void main(String[] args) {
        // 익명 클래스
        // 지역변수로 선언하여 사용

        var creature = new Creature();
        creature.method(new Animal() {

                            @Override
                            public void move() {
                                System.out.println("doc move....... ");
                            }

                        });
        }
    }