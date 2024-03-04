package ch01;

public class PinCodeTest {
    public static void main (String[] args) {
        int flagRead = 0b0001; // 비트 한개당 1비트= 4비트
        int flagWrite = 0b0010;


        int permission = flagRead | flagWrite; //0011
        // flagRead, flagWrite 둘 중에 하나라도 맞으면 출력
        System.out.println(permission); // 10진수로 표현
        //3 = 2의 0승+ 2의 1승
        System.out.println(Integer.toBinaryString(permission));


        int pin1 =  1;
        int pin2 = 2;

        int powerOn = 0b0100;
        int triggerOn = 0b1000;

        //  특정 핀 상태 2개를 받아서 or 연산을 해서
        // 파워 상태를 체크하자


        int permission2 = pin1 | pin2; // 0011
        System.out.println("GPIO STATE  = "+permission2);

        // & = and 비트연산                  0011&0100
        boolean isPowerOn = (permission2 & powerOn) != 0;
        System.out.println(isPowerOn);

    }
}
