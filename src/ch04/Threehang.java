package ch04;

import java.util.Scanner;

public class Threehang {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("입력");

        var num= sc.nextInt();
       // String result = (num > 0 )? "양수": "양수아님";
        //System.out.println(result);


       // String result1;
        //if (num>0){
        //result1="양수";
       //}

       // else if (num==0){
        // result1="0이다.";
       // }
        //else{
       //     result1= "음수";
       // }

        // 위의 코드를 3항 연산자로 바꾸기
       String result1= (num>0 )? "양수": (num==0)? "0이다 " : "양수아님";
        System.out.println(result1);
    }
}
