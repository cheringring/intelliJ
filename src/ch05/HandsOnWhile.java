package ch05;

// 외부의 변수를 밖에서 받아올때
public class HandsOnWhile {
    public static void main(String[] args) {

        var i = 0;
        var sum = 0;
        while (i <= 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }
}


