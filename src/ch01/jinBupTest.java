package ch01;

public class jinBupTest {
    public static void main(String[] args){

        //진법 전환 알고리즘

        int number = 10;
        int radix = 2; //2진수로 변환
        int reminder = 0 ;


        while (number>0){

            reminder = number%radix;
            System.out.println(reminder);
            number =number/radix;

            // 밑에서부터 보면 1010
        }
    }
}
