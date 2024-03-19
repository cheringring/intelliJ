package ch20.Car;

import java.util.Objects;

public class Car {
   private String name; //브랜드 명
   private int number; // 시리얼 넘버
    private int numbering;

    Car [] car = new Car[1000];

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Car(String name,int number){
        this.name= name;
        this.number= number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return number == car.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "자동차 \n" +
                "브랜드='" + name + '\'' +
                ", 시리얼 넘버 =" + number +
                '\n';
    }


    }


