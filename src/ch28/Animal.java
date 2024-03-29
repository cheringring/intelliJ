package ch28;


// 기능을 추가하고 싶으면? 인터페이스 클래스를 하나 더 만들어서
// 임플리먼트 할 클래스에 끼워넣으면 됨.

public interface Animal {
    // public abstract가 빠진형태
    void cry();
}

interface Pet{
    void play();
}

class Tell{

    public void Move(){
        System.out.println("살랑살랑");
    }
}

// 얘는 상속만 되는 클래스야~ 라고 알리고 싶으면
// abstract 붙임.
class Cat extends Tell implements Animal ,Pet{
    // 일반 클래스를 extends< 상속 할 수 있고
    // 인터페이스 클래스를 implements 할 수 있다.


    // 반드시 상속과 인터페이스 클래스들을 다시 구현해줘야함.
    @Override
    public void Move() {
        super.Move();
    }

    @Override
    public void cry() {

    }

    @Override
    public void play() {

    }

}

