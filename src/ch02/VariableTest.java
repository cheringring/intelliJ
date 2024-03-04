package ch02;

public class VariableTest {
    public static void main(String[] args) {

        int age = 0;
        age =20;
        int age2 = age;

        System.out.println(System.identityHashCode(age));
        System.out.println(System.identityHashCode(age2));

        int b,c;
        b=3;
        c=1;

        int f=10, g=20;
       // a= 10, b=20;

        int y;
        y=9;

        System.out.println(y);
    }
}
