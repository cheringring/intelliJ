package ch13;

public class Car {
    String modelName;
    String color;
    int maxSpeed;

    public Car(){
        // this 생성자 호출할때 this문은 무조건 첫번째여야한다,.
        this("KIA","blue");
        // 밑에꺼말고 이렇게 쓰면 Car 오버로딩한 클래스에
        // 요게 딱 들어감.

        //초기화할거면 생성자함수에서 해야함.
        System.out.println("Car() call");
        modelName="KIA";
        color="blue";
        maxSpeed= 90;
    }
    // 2. Car 생성자 함수가 없다고 가정.

//    public static void setMode(String modelName){
//        // static은 클래스 메소드. 여기선 this를 쓸 수 없다.
//        //this.modelName=modelName;
//    }
//



    // 1. 오버로딩을 통해 생성자 재정의

    // 필수 속성은 오버로딩을 통해 재정의 하면 된당.!
    public Car(String modelName,String color){
        this.modelName= modelName;
        this.color=color;

    }
    // 여기서 접근 제한자가 Private가 붙으면 car클래스 안에서만
    // 보이고 다른데선 안보인다.

}


class Main2{
    public static void main(String[] args) {
        //2.  디폴드 컨스트럭쳐를 정의하지 않았기때문에
        // 여기서도 안만들어준다. 컴파일러가 관여하지않음.
        // 개발자가 재 정의했기 때문.

        //  var car = new Car();

        // 1. defalut 기본생성자 생김



        System.out.println("main-");

        // 생성자 오버로딩
        // 기본 생성자는 더이상 컴파일러가 제공하지 않는다.
        var superCar = new Car("AUDI"
,"RED"); // 두개의 파라미터를 필수적으로 받아야돼.
        // 사용자로부터 입력을 받아야 car 객체를 생성할 수 있다.
        // car를 생성하기위해서 반드시 필요한 속성이라고 보면됨.


    }
}
