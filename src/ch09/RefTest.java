package ch09;


public class RefTest {
    public static void main(String[] args) {

// static 아니어서 new 써야 객체 생성됨,
        var refTest = new RefTest();
        int val = 1; // local varlabel

//        int[] refArr = new int [1];
//        refArr[0]=1;


        int [] refArr ={1,3,6}; // instance varlable
        // 키 값으로 접근하기 떄문에 대괄호

        refTest.addValue(val);
        System.out.println(val);
        // 출력 결과: 1  값이 int val에 복사가 됐다.
        // = 원본의 값에는 영향이 없다.



        refTest.addRef(refArr); // 호출
        System.out.println(refArr[0]);
        // 출력결과 : 999

    }
    public void addValue(int val){ // callee가 1을 받음.
        val =100;
        // 출력 결과: 1  값이 int val에 복사가 됐다.
        // = 원본의 값에는 영향이 없다.

    }
    public void addRef(int[] refArr){
        refArr[0]= 999;


    }
}
