package ch08;

public class OverloadingTest {

    public void display(int num) {
        System.out.println(num);
        // 인스턴스 메소드
    }

    // 메소드 이름은 같지만 시그니처가 다름!!!!!!!!!!!!!
    //  메소드 오버로딩 ~ ^ㅁ^

    public void display(int num1, int num2) {
        // 이걸 시그니처라고 함.
    }

   /* public int display(int num) {
 동일한 메소드 이름 동일한 시그니처면 똑같은 메소드로 보기 떄문에
 오류가 뜬다. -> 같은 함수로 판단 -> 함수 이름을 달리해야한다.

    }
}
*/

    public int display2(int num) {
        return 0; // 이렇게!
    }
}


    class AppUI {
        public static void main(String[] args) {
            var overloadingTest = new OverloadingTest();
            overloadingTest.display(9);
            // overloadingTest.display(1, 0); // 이건 첫번째 파라미터만 의미가 있고
            // 뒤에껀 의미가 없다. -> 이렇게 쓰면 별로다..
        }
    }



