package ch03;

import javax.swing.text.Style;
import java.util.Scanner;

public class ConditionTest {
    public static void main(String[] args) {

        System.out.println("나이를 적어주세요.");
       int age = new Scanner(System.in).nextInt();
        int charge = 0;

        // else if 가 2개 이상이면 swich문으로 바꿔서 계산해라.


        if (age < 5) {
            charge = 1000;
            System.out.println("미취학아동");
        }

        else if (age < 20) {
            charge = 4000;
            System.out.println("성인");
        }
        else {
            charge= 10000;
            System.out.println("성인");
        }
        System.out.println("요금은"+charge+"원 입니다.");
    }
}
