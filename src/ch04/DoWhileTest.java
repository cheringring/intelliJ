package ch04;

import java.util.Scanner;


// 10~ 99 까지의 숫자를 입력받고
// 10의 자리와 1의 자리가 동일하면 10의 자리가 동일합니다. 라고 출력
public class DoWhileTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        boolean bFlag = false;

        do {
            var input = sc.nextInt();
            if (input % 10 == input / 10) bFlag = true;
            else System.out.println("다른 숫자 입니다.");

        }

        while (!bFlag);
    }
    }