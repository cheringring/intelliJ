package ch04;

public class TypeTest {
    public static void main(String[] args) {
        int intVal = 10;
        double doubleVal = intVal;
        System.out.println(doubleVal);

        double doubleVal2 = 10.99;
        int intVal2 = (int)doubleVal2;
        System.out.println(intVal2);

        int bigNum = 10000;
        byte smallNum = (byte) bigNum;
        System.out.println(smallNum);

        // 01111000   01111010   01111100  01111010

        double dNum = 1.2;
        float fNum= 0.9F;


        //큰 타입과 작은 타입의 연산시 큰 타입으로 흡수


        float fSum = (float)(dNum+fNum);

    }
}
