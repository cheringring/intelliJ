package ch03;

public class TypeTest {
    public static void main(String[] args) {

        int i = 10; // 지역변수

        var age = 10; // 자기가 알아서 타입을 지정해줌, 지역변수내에서만 활용
         // 함수블럭 안에서만 사용 가능 ex) public class 여기선 사용 x

        //  var을 쓰면 문자를 재 할당할 수 없다.
        //   age = "kim"  < 이렇게 못함.

    }
}
