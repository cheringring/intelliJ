package ch06;

public class LoopTestBreak {
    // sum이 100 이상이면 탈출
    public static void main(String[] args) {
        var sum =0;
        for (int i =1; i<=100; i++){
            sum += i ;
            if (sum>=100)break; //여기서 return;을
            //하면 그냥 빠져나감.
            //   System.out.println(sum);이 작동하지
            //   않음.
        }
        System.out.println(sum);
    }
}
