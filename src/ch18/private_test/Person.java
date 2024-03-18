package ch18.private_test;

public class Person {
    private int age;

    public void setAge(int age){
        if (age <150) {
            this.age =age;
            System.out.println("age < ");
        }
        else System.out.println("wrong value");
    }
    public int getAge(){
        return age;
    }
}

class Main {
    public static void main(String[] args){
        var person = new Person();
        // 타 객체에서 person 객체의 속성인 age가 보이지 않는다.
        // private 속성이기에
        person.setAge(140);
    }
}

