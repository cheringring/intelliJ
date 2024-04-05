package ch32;

public class Person implements AutoCloseable{
    private int age;

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void close() throws Exception {
        System.out.println("person obj close..");
    }
}

class Main{
    public static void main(String[] args) {

        // try with resource
        try (Person p = new Person()){
            p.setAge(18);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
