package ch31;

public class ExceptionTest {
    public static void main(String[] args) throws Exception {

        new ExceptionTest().divide(3,0);

    }

    public int divide(int num1, int num2) {
        try {
            if (num2 == 0) throw new Exception("0으로 나눌 수 없어요.");

        } catch (Exception e) {
            e.fillInStackTrace();
        }
        return num1 / num2;
    }
}
