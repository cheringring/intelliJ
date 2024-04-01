package ch28;

public class Sport implements Behavior{

    @Override
    public void play() {

    }

    public void outTeam(){

    }

}

class Guitar implements  Behavior{
    @Override
    public void play() {

    }

    public void electronic(){

    }
}
// 스포츠랑 기타는 아무 연관이 없다.
// 연관없는 두개의 클래스가 공통의 메소드를 구현
// 이 두개의 관계를 엮어준다.

interface Behavior{
    void play();
}

class Main{
    public static void main(String[] args) {
        play(new Sport());
        play(new Guitar());

    }

    public static void play(Behavior behavior){
        behavior.play();
    }
}