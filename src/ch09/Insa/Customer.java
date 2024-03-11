package ch09.Insa;


public class Customer {

    String name;
    byte age;

    public void setName(String name){
        this.name= name;
    }
    public void setAge(byte age){
        this.age= age;

    }
    public void greet(Customer othercustomer) {
        System.out.println(name + ": 안녕?" + othercustomer.name);
        // 중요

    }

    public void printInfo(){
        System.out.println("학생의 이름은"+name+", 나이는 "+age+"입니다.");
    }
}

class AppUI {
    public static void main(String[] args) {

        var customer= new Customer();
        customer.setAge((byte)19);
        customer.setName("kavin");

        var customerTwo = new Customer();
        customerTwo.setAge((byte)18);
        customerTwo.setName("david");


        customer.greet(customerTwo);

    }
}
