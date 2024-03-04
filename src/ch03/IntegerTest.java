package ch03;

import java.math.BigDecimal;

public class IntegerTest {
    public static void main(String[] args) {
        byte by =12; //1바이트에서 표현할 수 있는 수 : 127
        // 묵시적으로 형변환이 자동적으로 됨.
        byte by2 =126;
        int iby = by;  // byte를 int에 담았음 작->큰 형변환 가능~

        System.out.println(by);
        System.out.println(by2);
        System.out.println(iby);
// 큰 사이즈에서 작은 사이즈로 갈려면 프로그래머가 직접 타입을 명기해줘야함


        by = (byte)iby;
        System.out.println(by);


        int i2 = 66666;
        by=(byte)i2;
        System.out.println(by); // 이ㅏ=상한 값이 나옴


        short sby= 89;
        i2 = sby;
        System.out.println(sby);


        int i = (int)3.14;
        System.out.println(i);


        BigDecimal bd = new BigDecimal("28.45");
        System.out.println(bd.subtract(bd));
    }
}
