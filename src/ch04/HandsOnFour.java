package ch04;


//사용자로부터 년도를 입력받아 해당하는 년도에
// // 일수를 출력하는 프로그램
// 2월은 윤년에 따라 일수가 29일(윤년)에서 28일로 변경된다.
// 윤년 = (년도 %4 == 0 && 년도 % 100 ==0 ) 이거나 (년도 % 400 ==0)이면 윤년


import java.util.Scanner;

public class HandsOnFour {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력해주세요.");
        int th = sc.nextInt();

        boolean threal= ((th % 4 == 0 && th % 100 ==0) || (th%400==0));
        if (threal) {
            System.out.println(+th + "년도의 2월의 일수는 29일입니다.");
        }
            else {
                System.out.println(+th+"년도의 2월의 일수는 28일입니다.");
            }


    }
}
