package ch20.Car;

    public class Audi extends Car {

        int speed;

        public Audi(String name, int number) {
            super(name, number);
            name = "Audi";
        }

        public void boosterMode(int speed) {
            if (speed>130){
                System.out.println("부스터 모드 on 되었습니다.");
            }
            else System.out.println("부스터 모드 Off 되었습니다.");
        }
    }