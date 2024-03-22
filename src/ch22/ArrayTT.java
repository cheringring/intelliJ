package ch22;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;


// 자바 유틸에 있는 모든걸로 받겠다라는 뜻
import java.util.*;


public class ArrayTT {
    public static void main(String[] args) {

        List<String> list= Collections.checkedList( new ArrayList<>(),String.class );
        list.add("kavin");
        list.add("david");

        // list를 array로 변환하고자 할 때
        String [] arr1 = new String[list.size()];
        String [] arr2 = list.toArray(arr1);

        System.out.println(Arrays.toString(arr2));

    }

    public void makeSomething(Object obj){
        ArrayList<Double> list2 = (ArrayList<Double>) obj;
        list2.add(2.0);
        list2.add(1.0);

        System.out.println(list2);

        for (double d: list2){
            System.out.println(d);
        }
    }
}
