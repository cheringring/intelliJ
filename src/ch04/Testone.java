package ch04;

import java.util.Scanner;

public class Testone {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("입력하세요");

        // 스캐너로 받아온걸 문자열로 인식한다.
        String str= scanner.nextLine();


        char c = str.charAt(0); // < 한글자만 선택해서 char타입으로 변환한다.
        // 인덱스 0번


        boolean checkFlag = (c>='A' && c<='Z');
        System.out.println(checkFlag);
    }
}

