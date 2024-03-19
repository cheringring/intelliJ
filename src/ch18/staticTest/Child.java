package ch18.staticTest;

public class Child {

    public void method(){
       // Long myCount = new Student().myCount();

        // 만약 차일드가 스튜던트 객체에 관심이 없고 카운트만 하고 싶다면?
        // Student 클래스에서 count() 메소드만 static으로 열어준다.

        Student.myCount();

        // 그리고 new 선언할 필요 없이 이렇게 써준다.


    }
}
