package ch30;


@FunctionalInterface
// 인터페이슨데 메소드를 한개만 가지고 있는 것을
    //함수형 인터페이스라고 한다.
interface IAdd<T>{
    T add (T x,T y); // T : 타입 미정이야.

}
public class AppUI {
    public static void main(String[] args) {

        IAdd<Integer> o = (x, y) -> (x + y);
        // 인터페이스를 o로 받았다.
        // 람다식 = 함수의 구현체가 된다

        int result = o.add(3, 5);
        System.out.println(result);

    }
}
