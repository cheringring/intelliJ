package ch04;

import java.beans.PropertyEditorSupport;
import java.util.Scanner;
// 세자리 정수 (100-999를 입력받고 각 자리의 자리수합을 구하시오.
public class HandsOnOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("100에서 999까지 입력하시오.");
        int num = sc.nextInt();

// 912
       // int h1= num%10; // 2
       // int m1= num / 10; // 91
      //  int h2= m1 %10; // 1
      //  int m2 = m1 / 10; // 9
      //  int h3= m2 %10; // 못나누니 그대로 9
      //  var sum = h1+h2+h3;

 // 912 //% : 나머지
        //   / : 나누기


      /* int h1= num%10; // 2
        num /= 10;
        int h2= num%10; // 1
        num/=10;
        int h3= num %10; // 9
        var sum = h1+h2+h3;

*/
        var sum= 0;

        while (num>0){
            // 처음에 제일 작은 숫자 나머지 부터 담고
            // 계속 나눠가면서 10 나누기
            int h = num%10;
            num /= 10;
            sum += h; // num이 0이 될때까지
            // // sum = h++ ;
        }

        // int result = num[0] +num[1]+num[3];

        //if (num >= 100 && num<=999){

        System.out.println("각 자리수의 합은  "+sum+"입니다.");


    }
}
