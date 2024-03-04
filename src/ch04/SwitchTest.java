package ch04;


// 열거형 클래스
//상수 클래스
// 접근 제어 지시자가 없기에 패키지내에서만 활용 가능한 클래스

import java.util.Date;

enum DATE {
    MON, TUE, WED, THUR, FRI, SAT, SUN,
}


// enum 클래스와 달리 인스턴스 변수를 가지고 있다.
//" MON" 이라는 상수를 정의하는데 사용됨.

/*
class CDate {
    public static final CDate MON = new CDate("MON");

    private String date;
    private CDate(String date) {
        this.date = date;

    }
}
*/


public class SwitchTest {
    public static void main(String[] args) {

        /*
        String today = "MON";


        switch (today) {

// break문이없으면 break가있을때까지 case구문이실행된다.

            case "MON":

            case "TUE":
                System.out.println("병원을가야합니다.");
                break;

            case "WED":
                System.out.println("학교에가야합니다.");
                break;

            default:

                System.out.println("일정이없습니다.");
                break;


         */
        /*
           MONDAY , WEEKEND 라는 상수를 만들고
           스위치 문 안에서 2개로 제한하고


            final int MONDAY = 1;
            final int WEEKEND = 2;

            int choice = 2;
            switch (choice) {
                //break문이 없으면 break가 있을때까지 case 구문이 실행된다.

                case MONDAY:
                    System.out.println("주말입니다.");
                    break;

                case WEEKEND:
                default:
                    System.out.println("일정이 없습니다.");

            }

            //  Enum은 new 키워드를 사용할 수 없다.

        열거형 DATE와 클래스 CDate를 사용하여
        각각 FRI와 MON상수를 변수에 할당하려는 시도

            //  DATE myDate = DATE.FRI;
            //     CDate myCDate = CDate.MON;

            /* enum 클래스를 설명하려고 했던 것 같음.
        switch (myDate) {
            case FRI:
                System.out.println("금요일입니다.");
                break;

            case MON:
                break;

             */
            SwitchTest.findDay(DATE.MON);
            } //static main func end ...

    //DATE 열거형을 매개변수로 받아서 해당 요일을 출력하는 역할
            public static void findDay (DATE date){
                System.out.println(date.name()); // date 에 선언된 enum
                //  DATE 안의 해당 상수의 이름 MON,TUS ... 를 반환

                switch (date) {
                    case FRI:
                        System.out.println("금요일입니다.");
                        break;

                    case MON:
                        break;
                }
            }
        }






