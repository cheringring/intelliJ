package ch05;
// 타자연습앱을 만들어보자
//3개의 문장을 배열에 저장하고 ,
// 각 문장을 보여주고 사용자가 해당 문장을
// 입력하고 각 문장 별 정확도와 타자시간을 출력하자

import java.util.Scanner;

// 정확도 = (맞춘글자수 / 총 글자수) *100
public class HandsOnTaza {
    public static void main(String[] args) {

        String[] arr = new String[3];
        arr[0] = "안녕하세요.";
        arr[1] = "반갑습니다.";
        arr[2] = "메밀꽃 필 무렵";


        //  var accuracy = (( HandsOnTaza.CorrectCalculator(correctCount) )/ arrLength) * 100;
        // var arrLength = arr.length(); // 총 문자수

        Scanner sc = new Scanner(System.in);

        for (var i = 0; i <= arr.length; i++) {
            System.out.println(arr[i]);
            System.out.println("타자 연습을 시작하겠습니다. 문장을 적어주세요.");
            var startTime = System.currentTimeMillis();
            var input= sc.nextLine();
            var endTime = System.currentTimeMillis(); // 펑션임
            var accuracy = HandsOnTaza.CorrectCalculator(arr[i], input);
            System.out.println("시작시각은 " + startTime + "초,  끝난시각은" + endTime + "초, 정확도는" + accuracy + "입니다.");


        }
    }

    public static double CorrectCalculator(String arr, String input) {
// 배열에 맞춘 글자 비교하는 클래스

        int correctChar = 0;

// Math.min() 함수는 주어진 두 수 중에서 작은 값을 반환하는 함수입니다.
// 이 함수가 사용된 이유는 배열의 길이와 입력 문자열의 길이 중에서
// 더 작은 값을 선택하여 루프를 반복하기 위해서입니다.
// 여기서 for 루프는 두 문자열 중에서 더 짧은 길이를 기준으로 반복되어야 합니다.
// 그렇지 않으면 배열의 길이나 입력 문자열의 길이 중에서 더 긴 쪽의 인덱스 범위를 벗어나는 경우에 IndexOutOfBoundsException 오류가 발생할 수 있습니다.
        for (int i = 0; i < Math.min(arr.length(), input.length()); i++) {
            if (arr.charAt(i) == input.charAt(i)) correctChar++;
        }
        // string으로 받아서 하나씩 비교가 안되니까 chatAt을 통해
        // char 형으로 받아서 하나씩 비교한다.

        // 정확도
        var rate = (((double) correctChar) / arr.length() * 100);
        //
        var fomatStr = String.format("%2,2f", rate);
        return Double.parseDouble(fomatStr);

    }

}