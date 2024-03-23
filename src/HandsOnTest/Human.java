package HandsOnTest;

public class Human {

    protected String name;
    protected int age;

    public Human (String name,int age){
        this.name= name;
        this.age=age;
    }


    public void learn(){
        System.out.println("learn");
    }
    public void walk(){
        System.out.println("walk");
    }

    public void eat(){
        System.out.println("eat");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "이름: '" + name + '\n' +
                "나이: " + age ;
    }
}
