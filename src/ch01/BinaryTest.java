package ch01;

public class BinaryTest {
    public static void main(String[] args){

        int num = 10;
        int bnum= 0B1010; // 0B : 2진수를 나타냄
        int onum = 012; //0: 8진수
        int xnum = 0xA; // 0x: 16진수

        System.out.println(bnum);
        System.out.println(onum);


        char c= 'A';
        System.out.println(c);
        System.out.println((int)c); // int type으로 출력했을때
        //  A의 유니코드 65가 나옴.

        char uc = '\uAC11'; //갑
        System.out.println(uc);
        System.out.println((int)uc);

        char uc2 = '갑';
        System.out.println(Integer.toHexString(uc2));
        // 갑을 hexstring으로 찍어보면 ac11이 나온다.
        // 정수관련된 유틸 클레져는 (정수)hexstring에 담겨져있다.

    }
}
