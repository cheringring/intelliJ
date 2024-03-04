package ch03;

public class StrTest {
    public static void main(String[] args) {


        // 리터럴 사용
       // String a= "hello";
       // System.out.println(a);
        // System.out.println(a.hashCode());

       // a= a+"world";
        //System.out.println(a);
       // System.out.println(a.hashCode());


        String a = "Hello";
        String b = "Hello";

        System.out.println(System.identityHashCode(a));
        System.out.println(System.identityHashCode(b));

// 리터럴로 반환시 위치가 똑같다.



        // new () 메모리를 런타임 시 동적으로 생성한다.->Heap 메모리


        String str = new String ("Hello");
        String str2 = new String ("Hello");

        if (str.equals(str2)){
            System.out.println("equal");
        } else{
            System.out.println("not equal");
        }

        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));

        // 이떄 str은 변수기 때문에 stack에 저장된다.
        // 똑같은 글자임에도 각자의 공간이 생기기때문에 메모리 차지가 된다.


    }



}
