package HandsOnTest;

public class Main {
    public static void main(String[] args) {
        var programmer = new Programmer(new Human("춘자",20),"삼성");

        System.out.println("프로그래머 이름: "+programmer.getHuman().getName()+" \n " +
                "프로그래머 나이: " + programmer.getHuman().getAge());
        programmer.Cording();

        System.out.println("\n");


        var dancer = new Dancer(new Human("영희",34));
        System.out.println("댄서 이름: "+dancer.getHuman().getName()+" \n " +
                "댄서 나이: " + dancer.getHuman().getAge());
        dancer.Dancing();
    }
}
