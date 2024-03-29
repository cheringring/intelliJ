package ch27;

import java.io.Flushable;

public abstract class Pet {

    protected int age;
    protected Pet(int age ){
        this.age = age;

    }

    abstract protected void walk();
    protected void eat(){
        System.out.println("pet eat...");
    }

    protected void jump(){
        System.out.println("pet jump....");
    }

    protected final void wakeup(){
        walk();
        eat();
        jump();
    }
}

class Cat extends Pet{

    protected Cat(int age){
        super(age);
    }
    @Override
    protected void walk(){

    }
}


class Dog extends Pet{
    private String nickName;
    protected Dog(int age,String nickName){
        super(age);
        this.nickName= nickName;

    }

    @Override
    protected void walk() {

    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }
}


// 애완동물 snake가 추가 되었다
// snake 걸을 ㄸ ㅐ기어서 이동할 수 있다.

// 1. dog 과 snake 에 fly기능이 추가 요청이 왔다.
// 기존 로직을 변경하기에는 수정량이 너무 많아서
// 기존 로직을 파괴하지 않는 방법이 있을까?
// a. 합성


//class Snake extends Pet{
//    private FlyFunction flyFunction;
//    protected Snake(int age, FlyFunction flyFuction){
//        super(age);
//        this.flyFunction=flyFuction;
//
//    }
//
//    public FlyFunction getFlyFunction() {
//        return flyFunction;
//    }
//
//    public void setFlyFunction(FlyFunction flyFunction) {
//        this.flyFunction = flyFunction;
//    }
//
//    protected void walk(){
//
//    }
//}
//
//class FlyFunction{
//    private boolean isJumpFly;
//
//    public FlyFunction(){
//        this.isJumpFly= true;
//    }
//    public void fly(Pet pet){
//        System.out.println("Fly............");
//
//    }
//
//    public boolean isJumpFly(){
//        return isJumpFly;
//    }
//
//    public void setJumpFly(boolean jumpFly){
//        isJumpFly= jumpFly;
//    }
//}



// b. Adapter Pattern

class Snake extends FlyAdapter{

    protected Snake(int age){
        super(age);
    }
    protected void walk(){
    }
}

abstract class FlyAdapter extends Pet{
    protected FlyAdapter(int age){
        super(age);
    }

    protected void fly(){
        System.out.println("fly.....b");
    }
}

class Main {
    public static void main(String[] args) {
        var dog = new Dog(2,"멍멍");
        var cat = new Cat(1);

        dog.wakeup();
        cat.wakeup();



    }
}