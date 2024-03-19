package ch20.Car;

public class CarSystem {

    private Car name;
    private int number = 1000;
    Car[] cars = new Car[100];

    public void Numbering(int number) {
        for (number = 1000; number <= cars.length; number++) {
            number = name.getNumber();
        }
    }


    class CarUI {
        public static void main(String[] args) {
            System.out.println();
        }
    }
}

