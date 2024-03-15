package ch17;

public class Animal {  // outer class  휴먼에 외부에서 안보임.
    int life;

    private class Human {  // inner class
        int getOuter() {
            life=90;
            return life;
            // Animal의 this는 이너클래스를 만들면 자동적으로 만들어짐.(숨겨져있음)
        }
    }

    // private를 붙이면 애니멀 클래스 안에서만 유효한 클래스이다.
    // 휴먼을 숨기고싶어 -> 왜? 애니멀에서만 쓰고싶으니까.
    // 여기서 private를 없애면 패키지 밑에 나오는 클래스 명에 보인다.

    public void method() {
        var human = new Human();
    }
}

class Main{
    public static void main(String[] args) {
        Animal.Human.human = new Animal().new Human();
        System.out.println(human.getOuter());

    }
}

