package ch31;

import java.util.Arrays;
import java.util.List;

public class Car {

    private int idx;
    private String brand;
    private String model;
    private String color;
    private int dateYear;
    private int price;


    public Car(int idx,String brand,String model,String color,int dateYear,int price){
        this.brand=brand;
        this.color=color;
        this.dateYear=dateYear;
        this.price=price;
        this.model= model;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getDateYear() {
        return dateYear;
    }

    public void setDateYear(int dateYear) {
        this.dateYear = dateYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "idx=" + idx +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", dateYear='" + dateYear + '\'' +
                ", price=" + price +
                '}';
    }

}

class Main_ {
    public static void main(String[] args) {

        List<Car> cars = Arrays.asList(
                new Car(1, "LG", "L-202", "w", 1922, 3000),
                new Car(1, "LG-1", "L-101", "w", 1992, 1000),
                new Car(1, "SMS", "SMS-202", "r", 1999, 2000),
                new Car(1, "LG-4", "L-102", "r", 1995, 1000),
                new Car(1, "LG-4", "L-105", "w", 1995, 100)

        );

        // Q1 . 자동차 가격이 2000보다 작고, 컬러가 화이트인 차들의 정보를 출력하라
        // 2. 제조년이 1985년 이전인 화이트 차들의 총 합계 가격을 출력
        // 3.3000이하 자동차중에 브랜드가 lg로 시작하는 차량에 세금 10%를 더한 후 차들의 정보를 출력


        // Q1 . 자동차 가격이 2000보다 작고, 컬러가 화이트인 차들의 정보를 출력하라
        // for문 쓸거면 스트림이빠르다

        //중간 연산자(map,fliter,sort...),최종연산자(for, reduce,toList)
        cars.stream()
                .filter(c -> c.getPrice() < 2000)
                .filter(c -> c.getColor().equals("w"))
                .toList().stream().forEach(System.out::println); // toList()안에 든게 객체니까 여기 안에 있는
        // toString 호출함.

        // 스트림-> 트루인놈만 올라감.
        //1.스트림이 생기고, 필터로 거른다.
        // 2. toList()를 하게 되면 메모리에 있는걸 리스트로 만들어서 뱉어줌. -> stream()을 다시 던져준다
        // forEach를 해줘서 리스트를 반복시켜준다.-> 최종연산자 ( stream에만 쓸 수 있다.)
        // 반드시 스트림을 열었으면 최종연산자를 써줘야함.
        // 요렇게 받으면 리스트를 던져준다.

        //forEach(Sys..~)까지가 한 스트림 그 전까지 또 한 스트림이다.

        // 스트림은 원본데이터를 훼손하지 않고 중간연산자를 제공하기 떄문에 코드를 줄여준다.

        System.out.println("======================================");

        // 2. 제조년이 1995년 이전인 화이트 차들의 총 합계 가격을 출력

        System.out.println(cars.stream()
                .filter(c -> c.getDateYear() <= 1995)
                .filter(c -> c.getColor().equals("w"))
                .mapToInt(Car::getPrice).sum());

        System.out.println("======================================");
        // 3. 3000이하 자동차중에 브랜드가 lg로 시작하는 차량에 세금 10%를 더한 후 차들의 정보를 출력

        cars.stream()
                .filter(c -> c.getPrice() <= 3000)
                .filter(c -> c.getBrand().equals("LG"))
                .map(c -> {
                    c.setPrice(c.getPrice() + (int) (c.getPrice() * 0.1));
                    return c;
                }).toList().forEach(System.out::println);

        System.out.println("======================================");

    // 차량 색상이 화이트인 자동차 중에 가격순으로 내린차순으로 출력

        cars.stream()
                .filter(c->c.getColor().equals("w"))
                .sorted((c1,c2)->Integer.compare(c1.getPrice(),c2.getPrice())*-1)
                .toList().forEach(System.out::println);


}
    }
