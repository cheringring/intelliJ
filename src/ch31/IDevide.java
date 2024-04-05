package ch31;


import java.util.*;

@FunctionalInterface
public interface IDevide{
    int device (int x, int y);
}
//class AppUI {

    //람다식을 변수로
//    IDevide iDevide = (x,y) -> (x/y);
    //iDevide.device(3,5);

        //comparator익명클래스
        ///글자 길이 기준으로 오름 차순으로 정렬을 해보세요.
//
//        Collections.sort(words, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return Integer.compare(o1.length(),o2.length());
//            }
//        });
//        Collections.sort(words,(s1,s2)-> Integer.compare(s1.length(),s2.length()))
//        for(var s: words) System.out.println(s);
//    }
//
//    public static int resultMethod(Comparator<String> lambda){
//        return lambda.compare("aaaa","bbbb");
//
//    }
//}

