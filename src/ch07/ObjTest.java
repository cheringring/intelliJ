package ch07;



// MyObj는 Ch07내에서만 사용할 수 있다.
// public이 없기때문 ~^3^ ''


class MyObj{

}

// 객체는 New 라는 연산자를 통해서 만들어지는 것
// 객체는 인스턴스 연산자를 통해서 만들어진다.
public class ObjTest {
    public static void main(String[] args) {


        var myObj = new MyObj();
        // 객체를 올리고 올린 인스턴스 마이 오브젝트를 통해
        // 마이 오브젝트에 접근할 수 있다.


        // 자식은 부모를 지꺼처럼 쓸 수 있다.
       // 부모에 있는 메소드를 지꺼처럼 쓸 수 있다.
        //myObj.toString();
        // myObj.hashCode();
        // myObj. < 이 쩜 = 마이오브젝트라는 인스턴스를 통해서
        // 그 메모리에 있는 것을 접근함
        // toStrig(); hashCode() < 메소드,펑션일 경우
        // 일대일로 메모리와 맵핑이 됨.

        // <번외>
        // random 을 할려면 New를 해서 인스턴스를 생성하는데
        // 이게 꽤 무거운 동작이다.
        // 그래서 차라리 Math. ~ 를 통해 하는게 빠르다.

    }
}
