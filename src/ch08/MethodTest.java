package ch08;

public class MethodTest {
    static int x = 100, y = 200; // static변수,클래스변수
    int a = 10, b = 20; // 인스턴스 변수


    // 인스턴스 메소드는 인스턴스 변수를 그냥 쓸 수 있다.(맴버변수기때문)
    // 인스턴스 메소드는 객체에 메모리가 올라가기때문에
    int add() { //접근제어자 생략, 인스턴스 메소드,
        // 요 패키지 안에서만
        // 쓸 수 있다.
        // public 이 없기 때문에 @@
        return a + b;

    }

    // static(클래스) 메소드에서는 인스턴스 변수 혹은 메소드를 쓸 수 없다.
    static int addStatic() {
        // return a; < 이렇게 쓸 수가 없다.

        // int xx=9; 여기선 자유롭게 선언가능 자기메소드변수

        return MethodTest.x + MethodTest.y;
        // 이렇게 선언하고 써야됨.
        // add(); < 호출안됨.

    }

    // 0부터 100까지의 더하는 인스턴스 메소드를 구현해보자
    int calculator() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

}

class AppUIT{
    public static void main(String[] args) {
        System.out.println(MethodTest.addStatic());
        var methodTest = new MethodTest();
        System.out.println(methodTest.calculator());

        // instanceMethod라는 걸 AppUIT 클래스 안에서 만들고
        // calculator이라는 함수를 쓰고 싶으면?
        var app = new AppUIT();
        app.instanceMethod();
    }

    void instanceMethod(){
        System.out.println("instance");
        var methodTest = new MethodTest();
        System.out.println(methodTest.calculator());
    }
}



