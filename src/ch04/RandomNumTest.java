package ch04;

import java.util.Random;
import java.util.Scanner;

public class RandomNumTest {
    public static void main(String[] args) {

        Random random = new Random();
        var target = random.nextInt(50) + 1;

        Scanner sc = new Scanner(System.in);

        int loopCnt = 0;
        do {
            loopCnt++;
            var myNum = sc.nextInt();
            if (target > myNum) System.out.println(" 좀 더 높은 수를 입력하시오.");
            else if (target < myNum) System.out.println("좀 더 낮은 수를 입력하시오.");
            else {
                System.out.println(loopCnt + "번 만에 맞추셨습니다.");
                break;
            }
        } while (loopCnt < 5);

    }
}

