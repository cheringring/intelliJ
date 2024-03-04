package ch04;

import java.util.Scanner;

// 사용자로부터 키와 몸무게를 입력받고 비만도를 측정해보세요
//
public class HandOnThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("키를 입력해주세요.");
        double heg = sc.nextDouble();
        System.out.println("몸무게를 입력해주세요.");
        double weg= sc.nextDouble();

        double heg1= heg/100;
        double hegResult= heg1*heg1;
        double Calculator = weg/hegResult;
        System.out.println("체질량 지수는 "+(int)Calculator+"입니다.");

    }
}
