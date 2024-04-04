package ch30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Member implements Comparable<Member> {

    private String name;
    private int age;

    // 우리는 이름으로 내림차순 정렬을 할거다.


    public Member(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Member o) {
      //  Integer.compare(this.age,o.getAge())*-1;
        return this.name.compareTo(o.getName())*-1;
    }

    @Override
    public String toString() {
        return "맴버= " +
                "이름:" + name +
                "나이:" +age;
    }
}

class Main__{
    public static void main(String[] args) {
        var members = new ArrayList<Member>();
        // 리스트 만듦.

        members.add(new Member("안창숙",34));
        members.add(new Member("김인자",56));
        members.add(new Member("고명석",75));
        members.add(new Member("이묵헌",45));

        Collections.sort(members);

        for (var m :members){
            System.out.println(m);
        }
    }

}