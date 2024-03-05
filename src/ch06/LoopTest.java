package ch06;

public class LoopTest {
    public static void main(String[] args) {
        for(int i =1; i<=100; i++){
            if(i%3!=0)continue; // 조건이 맞으면
            // 다시 조건식으로 올라감
//  continue 구문이 실행되면 하위 코드는 실행이 되지 않는다.
            System.out.println(i+" ");

            //3
            //6
            //9
            //12
            //15
            //18   실행결과
            // ...
            //...
        }
    }
}
