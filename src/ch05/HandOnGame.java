package ch05;

import ch04.RandomNumTest;

import java.util.Random;
import java.util.Scanner;

public class HandOnGame {
    public static void main(String[] args) {

        // 가위바위보해서 1~3 랜덤으로 숫자 하나를 생성하고
        // 사용자로 부터 숫자
        // 하나를 입력받아 게임을 진행하자 .

        // 게임 후 전적표기 ex)1 win  0 lose <
        // 게임 후 사용자로부터 한게임 더 혹은 종료 메뉴를 보여주고
        //  한 게임 더 선택시 전적이 계속 누적되어야함 .

        int winCnt = 0;
        int loseCnt= 0;

        while (true) {
            Random random = new Random();
            int conNum = random.nextInt(3) + 1;
            System.out.println(conNum);
// 세는거
            final var GAWHI = 1;
            final var BAWHI = 2;
            final var BO = 3;

            Scanner sc = new Scanner(System.in);
            System.out.println("가위(1) , 바위 (2), 보 (3)를 입력하시오.");
            int userNum = sc.nextInt();
            System.out.println("가위바위보!");

            if (conNum == userNum) System.out.println("무승부");
            else {
                switch (conNum) {
                    case GAWHI -> {
                        if (userNum == BO){
                            System.out.println("졌습니다.");
                            winCnt++;
                        }
                        else{
                            System.out.println("이겼습니다.");
                            loseCnt++;
                        }
                    }
                    case BAWHI -> {
                        if (userNum == BO){
                            System.out.println("이겼습니다.");
                            winCnt++;

                        }
                        else System.out.println("졌습니다.");{
                            loseCnt++;
                        }
                    }
                    case BO -> {
                        if (userNum == GAWHI) {
                            System.out.println("이겼습니다.");
                            winCnt++;
                        }
                        else {
                            System.out.println("졌습니다.");
                            loseCnt++;
                        }
                    }
                }
                System.out.println("win count"+winCnt+"/n lose count"+loseCnt+" ");

                System.out.println("한 게임 더 (1), 종료 (2)");
                var i = sc.nextInt();
                if (i==2) break;


                System.out.println();


            }

        }
    }
}
