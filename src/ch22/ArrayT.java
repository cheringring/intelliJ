package ch22;

import java.util.*;

public class ArrayT {
    public static void main(String[] args) {

//        Set<String> set = new HashSet<>();
//        Map<String,String> map = new HashMap<>();
        // 이거랑 똑같음.

        List<String> list= new ArrayList<>();
        // arraylist가 차일드, 리스트가 부모. 어레이 리스트가 업캐스팅을 함.
        list.add("1");
        list.add("2");
        list.add("3");
//
//        list.add(1,"9");
//        // HashSet이 구현= 키를통해키를찾는다.
//        list.remove(1);
//        list.get(0);

        // list를 array로 변환하고자 할 때
        // String으로 명시적형변환해줘야됨.
        String [] arr = (String[])list.toArray();
        String [] arr1 = new String [list.size()];

    }
}
