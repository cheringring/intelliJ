package ch24.inheritance;



public class Animal {

    protected String type; // protected = 같은 패키지 또는 자식 클래스에서 사용할
     // 수 있도록 함.
    public Animal(String type){
        this.type=type;
        System.out.println("Animal ( " +type + " ) ");
    }

    public void move () {
        System.out.println("Animal Move");

    }
}


class Mammal{
    private Animal animal;

    public Mammal(Animal animal){
        this.animal=animal;
    }

    public Animal getAnimal(){
    return animal;
    }

    public void setAnimal(Animal animal){
    this.animal= animal;
    }
}
//    public Mammal (String type,int count){
//        super(type);
//        System.out.println("Mammal ()");
//    }
//}

class Dog{

    private Mammal mammal;

    public Dog(Mammal mammal){
        this.mammal = mammal;
    }

    public Mammal getMammal() {
        return mammal;
    }

    public void setMammal(Mammal mammal) {
        this.mammal = mammal;
    }
}

class Poodle {}


class FlyDog{
    private Poodle poodle;
    public FlyDog(Poodle poodle){

    }
    public FlyDog(Dog dog){

    }
}
class Main_ {
    public static void main(String[] args) {

        // Decoration pattern
        var dog = new FlyDog(new Dog (new Mammal(new Animal("BullDog"))));
// => 이렇게 하면 Animal()이 출력됨.


        // new FlyDog의 객체인 dog를 만들고
        // FlyDog안에 객체를 new로 불러와서 animal의 생성자 = Animal(String type)을 불러온다.
        new FlyDog(new Poodle());
    }
}
