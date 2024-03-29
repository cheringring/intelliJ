package ch28.MyObj;

import java.util.ArrayList;

interface Changeable{
    void change();
}

interface Powerable{
    void power(boolean on);
}

// 인터페이스 클래스에 한해서 다중상속 가넝.
interface Controlable extends Changeable, Powerable{

}

// 일반 클래스에 인터페이스 넣을려면 implement 해줘야함.
public class MyObj implements Controlable {
    @Override
    public void change() {

    }

    @Override
    public void power(boolean on) {

    }
}

class Main__{
    public static void main(String[] args) {
        var objs = new ArrayList<MyObj>();
        objs.add(new MyObj());
        objs.add(new MyObj());
        // objs라는 리스트에 MyObj라는 객체가 두개 들어가있음.

        Changeable changeable = objs.get(0); // 인덱스 0번체
        Powerable powerable= objs.get(1); //인덱스 1번째
        // 타입캐스팅을 내 맘대로 할 수 있다.


    }
}
