package ch06;

import java.util.Random;

// 1. 랜덤호출
// 2. 배열저장
// 3. 중복저장
//4 . 출력
public class RottoTest {
    public static void main(String[] args) {


        int[] lNum = new int[6];
        // random을 쓸때 int형으로 받아야 오류가안남.

        // 괄호할때 int 따로 해줘야 1이출력안됨.
        // 왜냐면 같이 묶어버리면 double로 돼버려서 항상
        // 1로 출력됨.
        int size =0;

        for (int i = 1; i <= 6; i++) {
            var randomNum = (int) (Math.random() * 45) + 1;
            var checkFlag = false;
            // 중복제거
            for (int j = 0; j < 6; j++) {
                if (lNum[i] == randomNum) {
                    checkFlag = true;
                    i--; // 다시 숫자를 받기위해 i를 하나 감소시킴
                    break;
                }
            }
            if (checkFlag) {
                lNum[i] = randomNum;
                size++;
            }
        }


            // enhanced for
            for (var num : lNum) {
                System.out.println(num + " ");
            }
        }
    }


