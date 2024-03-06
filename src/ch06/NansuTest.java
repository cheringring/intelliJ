package ch06;

// 1에서 9까지 난수 3개를 발생하고 (중복허용안됨)
// 사용자로부터 1에서 9사이의 정수를 3개를 입력받는다.

// 같은 위치에 같은 숫자이면 pass , 위치는 다르지만 숫자가 같으면 fail
//pass, fail 총 카운트를 출력하시오

import java.util.Random;
import java.util.Scanner;

// case : 사용자 입력은 1 5 9 라면
// 1 pass 1 fail 출력
// case: 사용자의 입력은 3 5 9 라면
// 0 pass 2 fail 출력
public class NansuTest {
    public static void main(String[] args) {


        Random random = new Random();
        Scanner sc = new Scanner(System.in);
        int[] bigNum = new int[3];
        int[] numInput = new int[3];

        boolean[] check = new boolean[10];

        var passCnt = 0;
        var failCnt = 0;


        for (int i = 1; i < 3; i++) {

            var randomNum = (int) (Math.random() * 3) + 1;
            if (check[randomNum]) {
                bigNum[i] = randomNum;

                check[randomNum] = true; // 그 방이 트루라면 그 방의 인덱스가
                // 차있다는 뜻이니까 값이 중복됐다 라는 걸 알 수 있다.
                break; // if를 빠져나옴 .
            }
        }

        System.out.println("난수 3개를 입력하시오.");
        for (var i = 0; i < 3; i++) {
            numInput[i] = sc.nextInt();

        }
        for (var i = 0; i < 3; i++) {
            if (bigNum[i] == numInput[i]) passCnt++;

            // 이제 입력한걸 리스트에 넣어야됨.
            // 넣고 같은 위치면
        }
    }
}
