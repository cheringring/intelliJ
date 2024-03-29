package ch26;

//추상화클래스
// 앞에 클래스를 상속하는 것 보다 추상화 클래스를
/// 상속하는 것이 더 낫다.

public abstract class Pet {
    // new pet 을 하지못함.


    // 1개 이상의 abstract 메소드를 가지고 있어야 추상화 클래스가 된다.
    abstract public void walk(); // 구현체가 없어도됨.
    abstract public void eat();
    protected int health;
    protected Pet(){
        health = 90;
    }
    public int getHealth(){
        return health;
    }

    public void run(){
        System.out.println("run......");
    }

    // template method
    public final void go(){ //추상화 클래스 안의 메소드에서
        // final이 붙으면 override 금지. go를 오버라이드 못한다.
        // pet에 go를 호출하면 순서대로 실행되야돼.

        walk();
        eat();
        run();
    }
}

abstract class Dog extends Pet{
    // 위에서 추상화 메소드인 walk은 꼭 구현해줘야.
    // 오류 안남.

    @Override
    public void walk() {
        System.out.println("dog wallk");

    }

}

class BullDog extends Dog{

    @Override
    public void eat() {
        System.out.println("bulldog eat");

    }
}

class UI{
    public static void main(String[] args) {
        // new ch27.Pet(); < 이거 안됨.
        // 위에서 추상화 메소드들을 자식 클래스들이 구현해서 이제 new 를 쓸 수 있음.

        Pet pet = new BullDog();
//        pet.eat();
//        pet.walk();
        pet.go();

    }
}
