package ch19;

public class StaticBlockT {

    // 웹으로 고객의 로또번호 다섯개를 받았다고 가정.
    // 제일 높은 숫자를 우리는 알고 있어야한다.

    private static int max;

    static {
        // 아마존의 웹 서비스 서버를 통해 추첨된 5개의 번호입니다.
        // 웹 커넥션하고
        // 인증하고
        // 토큰 생성 하여 얻어진 잘.
        int [] numbers = {10,20,8,19,55};
        // 키 값을 넣을땐  { } 를 써야한다.
        // new int[5] 와 동일

        // 첫번째로 가정.
        max = numbers[0];

        // 20 부터
       for (int i = 1; i<numbers.length; i++){
           if(numbers[i]>max) max = numbers[i];

       }
    }

    public static void main(String[] args) {
        int maxValue = StaticBlockT.max;
        System.out.println(maxValue);
    }
}
