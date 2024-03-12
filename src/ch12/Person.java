package ch12;

import java.awt.*;
import java.util.Objects;

public class Person {
    int age;
    String name;

    public void setAge(int age) {
        this.age = age;
    }

    // 함수 이름은 그대로 동일하게 두고 파라미터를 활용해서
    // 오버라이딩을 하는게 더 효율적이다.
    public void setAge(int age, int padding) {
        if (age > 20) padding = 20;
        else padding = 10;

        age += padding;
    }

    @Override
    public String toString() {

        // toString메소드의 숨겨진 argument
        // super는 부모메소드

        return age + "." + name;

    }

    @Override
    public boolean equals(Object ob) {
        if (this == ob) return true;

        // 객체의 인스턴스가 뭔지 체크
        if (!(ob instanceof Person)) return false;
        // person의 인스턴스가 ob가 아니면 false를
        //리턴해라.
        var person = (Person) ob;
        // 강제 형변환

        //   return this.name.equals(person.name);
        // 여기 있는 네임의 객체랑 펄슨에 네임 객체랑 같냐 비교
        //return Object.equals(this.name, person.name);

        return false;
    }
}




class AppMain {
    public static void main(String[] args) {
        var person = new Person();
        System.out.println(person);
        //println이 toString을 호출하고있다.
        person.age = 90;
        person.name = "david";
        System.out.println(person);
        System.out.println(person.hashCode());

        var person1 = new Person();
        System.out.println(person1);
        //println이 toString을 호출하고있다.
        person1.age = 90;
        person1.name = "david";
        System.out.println(person1);
        System.out.println(person1.hashCode());

        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);
        // hello라는 상수값이 같으니까 true가 나온다.
        System.out.println(s1.equals(s2));
        // true

        System.out.println("\n real adderss \n");
        System.out.println(System.identityHashCode(person));
        System.out.println(System.identityHashCode(person1));

        // 메모리가 다르기때문에 같은 객체라고 생각하지 않는다.
        System.out.println(person == person1);
        // false
        System.out.println(person.equals(person1));


    }

}