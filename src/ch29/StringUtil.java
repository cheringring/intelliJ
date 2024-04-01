package ch29;

import java.io.StringBufferInputStream;

public class StringUtil {
    public static void main(String[] args) {


        int i = 10;

        // 문자열을 조합할 때 String 클래스를 활용해서 + 연산자로
        // 하면 메모리 낭비가 될 수 있다.
        String str1 = "kim";
        String str2 = "park";

        System.out.println(str1.hashCode());

        str1 += str2; //결국 str1에다가 값을 넣고 있다.
        System.out.println(str1.hashCode());
        System.out.println(str1);
        //106191 첫번쨰
        //-711195847 두번째 메모리 저장소를 새로 만든다.
        // 값이 다르다.

// 문자열을 쓸 때 이걸 써라.
        // 단일 스레드 환경에서 좋음.
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(str1);
        System.out.println(stringBuilder.hashCode());
        stringBuilder.append(str2);
        System.out.println(stringBuilder.hashCode());
        System.out.println(stringBuilder.toString());

        //멀티 스레딩 환경에 좋다.
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("kim");
        stringBuffer.toString();
    }


    public String makeString() {
        StringBuilder builder = new StringBuilder();
        builder.append("kim");
        builder.append("park");
        builder.toString();

        return builder.toString();
    }

}
