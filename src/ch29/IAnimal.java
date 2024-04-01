package ch29;

public interface IAnimal {
    String move();
    String run();

}

class AppUI_{
    public static void main(String[] args) {
        IAnimal doc = new IAnimal() {
            @Override
            public String move() {
                return "개가 짖습니다.";
            }

            @Override
            public String run() {
                return "개가 달립니다.";
            }
        }; // 스테이트 문 마지막에 세미콜론을 붙여줘야된다.

        System.out.println(doc.move());
        doc.move();
    }
}
