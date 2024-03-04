package ch04;

public class OpratorTest {
    public static void main(String[] args) {

        //단항 연산자
        /*
        * ! : not의 의미
         */
        System.out.println(!true);

        int i = 0;
        int j = i++;

        System.out.println(i);
        System.out.println(j);

        int k = 0;
        int g = ++k; //전위
        // k = k+1 ; // ++k
        System.out.println(g);
        System.out.println(k);

        /* 증감, 감소 연산자 EX

         */

        int num1= 20;
        int result= num1++ * 3;
        System.out.println(result);
        System.out.println(num1);

        int num2= 20;
        int result2 = ++num2 *3;

        int gameScore = 150;
        int lastScore = ++gameScore;

        lastScore= gameScore++;

        System.out.println(gameScore);
        System.out.println(lastScore);
    }
}
