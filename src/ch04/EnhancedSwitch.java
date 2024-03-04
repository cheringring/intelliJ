package ch04;


enum GENDER{
    MALE,FEMAL,
}
public class EnhancedSwitch {
    public static void main(String[] args) {

        GENDER gender=GENDER.MALE;

        /*
        switch (gender){
            case MALE -> {
                int i = 9;
                System.out.println("남자입니다.");

            }

            case FEMAL -> System.out.println("여자입니다.");
            default -> System.out.println("중성입니다.");
        }
        */

        String result = switch (gender){
            // case 절이 블록으로 묶이면 yield를 통해 값을 리턴해야한다.
            // 단문이면 별도 yield는 필요없다.

            case MALE -> {
                int i = 9;
                yield "남자입니다.";
            }

            case FEMAL -> "여자입니다.";
            default -> "중성입니다.";
        };

        System.out.println(result);
    }
}
