package ch32;

import java.io.*;

public class StreamTest {
    public static void main(String[] args) throws Exception {
//
//        // Byte기반의 스트림.
//        var InputStream = System.in;
//        int i = 0;
//
//        while ((i = InputStream.read()) != '\n') {
//            System.out.println((char) i);
//
//        }
//
//        InputStream.close();
//
//        int i =0;
//        var isr = new InputStreamReader(System.in); // inputStream한개씩만 읽어올 수 있는데
//        // 한글 가능
//        while ((i=isr.read())!= '\n'){
//            System.out.println((char)i);
//
//        }
//        int i = 0;
//        try (InputStreamReader isr = new InputStreamReader(System.in)) {
//            while ((i = isr.read()) != '\n') {
//                System.out.println((char) i);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//
//        }
//    }
        // 누군가에게 받아올때  이 기능을 쓰면 된다.
        //System.in < 입력하는 기능.

        int i = 0;
        try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){
            System.out.println(br.readLine());
            }catch (Exception e){
        e.printStackTrace();
    }


        // 시스템.인 은 바이트 기반이어서 문자기반인 인풋스트림리더로 바꾸고 다시 버퍼리더를 달면
        // 여러 글자를 읽어올 수 있다.


//        }
        //여기엔 자동으로 close 기능이있다.
    }
}