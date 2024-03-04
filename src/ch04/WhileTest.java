package ch04;

import java.util.Scanner;
//import ch04.constants.Constant;

public class WhileTest {
    public static void main(String[] args) {
    /*    int i =1;
        while (i<=10){
            System.out.println(i+" people");
            i++;
        }

        //1부터 10까지 총 합을 출력하는 while문을 작성하시오.

        int i = 1;
        var sum =0 ;
        while (i<=10){
            sum +=i; // sum = sum+i
            i++;
        */
        //1~10까지의 4의 배수의 합을 출력하시오.,

        /*
        int num =1;
        int sum =0;
        while (num<=10){
            if (num%4==0)
                sum += num;
            num++;
        }

        System.out.println(sum);
    }
}*/

        // 이전 두개의 숫자를 더하여 다음 숫자를 만들어가는
        // 프로그램을 작성


        /*
        // ex) 0,1  1 ,2 ,3, 5 ,8 ,13 ,21 ,34
        // 총 길이를 10개로 하고 만들어보자.


        int n = 10;
        int first = 0;
        int second =1;

        int count = 0;

        while ( n > count ){
            var next = first + second;
            first=second;
            second=next;
            count++;
        }

        }

*/

        Scanner sc = new Scanner(System.in);

        var choice = 0;
        var balance = 0;

      //  while (choice != Constant.END) {
            System.out.println("1. 예금  | 2. 출금  |  3. 조회  |  4. 종료 ");
            System.out.println("원하는 메뉴를 입력하세요.");

            choice= sc.nextInt();

            switch (choice){
            //    case Constant.IN_MONEY ->
            }
        }


        }
