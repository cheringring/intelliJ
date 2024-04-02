package ch30;

import java.awt.*;
import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public static void main(String[] args) {
        String [] strArr = {"zza","AAbbb","DDuu"};
        // Stirng array임.

        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2) *-1 ;
                // compareTo < 정렬하고자하는함수를 구현하라 ,
                // 내림차순으로 할거면 -1을 곱하면 된다.
            }
        });

        //Arrays호출. 정렬(sort) (정렬하고자하는 어레이 호출, 컴퍼레이터함수 )

        System.out.println(Arrays.toString(strArr));

    }
}
