package ch06;

public class NestLoopTest {
    public static void main(String[] args) {


        //case1 =  루프돌때 작은걸 앞에 두고 큰 걸 뒤로 배치하면
        // 속도가 좀 더 향상 된다.

        Long startTime = System.currentTimeMillis(); //long타입을 리턴함
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int k = 0; k < 1000; k++) {
                for (int j = 0; j < 10000; j++) {
                    sum += i * j * k * 555;

                }
            }
        }

        long endTime = System.currentTimeMillis();
        long diff = (endTime - startTime);
        System.out.println(diff);
        ///555 -> 0.6초 정도 돈다는 말




// 두번 부를 때 타입은 이중 선언 안해도 된다.
        // case 2
       startTime =  System.currentTimeMillis(); //long타입을 리턴함
         sum = 0;
        for( int i = 0; i<10000; i++){
            for(int k = 0; k<1000; k++){
                for(int j =0; j<100; j++){
                    sum +=i*j*k*555;

                }
            }
        }

        endTime = System.currentTimeMillis();
        diff = (endTime-startTime);
        System.out.println(diff);
        ///555 -> 0.6초 정도 돈다는 말
    }
}
