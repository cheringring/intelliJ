package ch04;

import java.util.Scanner;

public class LogicalOperatorTest {
    public static void main(String[] args) {

        // 입력 연산자를 값들을 가져오기위한 utill class
        Scanner scanner = new Scanner(System. in);
        System.out.println("정수 하나를 입력하세요");
        int num = scanner.nextInt();


        //논리 연산자
        // &&: 양 쪽의 항이 True일때만 True   and연산
        // || : 하나의 항이 True여도 True   or연산
        boolean checkFlag = (num > 1 && num <= 100);
        System.out.println(checkFlag);


    }
}
