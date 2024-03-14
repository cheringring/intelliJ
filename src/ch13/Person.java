package ch13;

import javax.swing.plaf.SpinnerUI;
import java.util.HashSet;
import java.util.Objects;

public class Person {
    String name;

    public void setName(String name)
    {
        this.name=name;

    }

//    @Override
//    public boolean equals (Object ob){
//        return Objects.equals(this.name,((Person)ob),name);
//    }
    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }




}

class Main{
    public static <Set> void main(String[] args) {
        var p1= new Person();
        p1.setName("kavin");
        var p2= new Person();
        p2.setName("kavin");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p1.equals(p2));

        // 객체를 저장할 수 있는 자료구조
        // 중복된 객체를 저장할 수 없다.
        // 즉 key가 동일하면 저장이 안됨.
        HashSet <Person> personSet= new HashSet<>();

        personSet.add(p1);
        personSet.add(p2);

        //해쉬 셋 만들어서 넣어라.
        //personSet도 객체의 집합이기 때문에 반복문 가넝

        for (var p:personSet){
            System.out.println(p);
        }

    }
}
