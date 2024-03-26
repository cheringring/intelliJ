package ch25.OverRideTest;

public class Person {
    //상속을 위한 클래스라고 가정.

    protected String name;
    protected int age;


    // 상속받는 클래스는 타 클래스에 자기꺼처럼 쓸 수 있다.
    // 인스턴스를 생성해서 같은 패키지내에서 접근 가능.
    // .  < 으로 접근 가능

    protected void sleep(){
        System.out.println("sleep from person ob");
    }



    protected void show(){
        System.out.println("show person info");
    }
}


// 자식의 접근 제어지시자는 부모보다 높거나 똑같아야됨.
//private만 아니면 다 쓸 수 있음 ex) public
class Superman extends Person {
    boolean isSuperPower;

    // 우클릭->생성-> 메소드재정의
    @Override
    public void sleep() {
        System.out.println("super man sleep");
    }
}

class AppMain{

    public static void main(String[] args) {
        Person person = new Person();
        AppMain appMain = new AppMain();
        // AppMain에 있는 psvm에 static이 붙어있기 때문에 앱 메인 밑에 있는
        // 셋 슬립 의 인스턴스를 만들어야 호출가능함.

        appMain.setSleep(person);


        Person superman = new Superman(); // 부모 타입으로 받음.
        // 부모메모리와 슈퍼맨 메모리를 다들고 있기때문에 묵시적 형변환됨
        // 슈퍼맨이름을 버리고 부모메모리에 어싸인됨.
        appMain.setSleep(superman); // 셋 슬립에 Person 타입이 들어갈 수 있는
        // 이유는 묵시적 형변환으로 인해 부모인 Person 객체에 어싸인 됐기 때문.
    }

    // 다형성 활용이 많이 많이 사용된다.
    public void setSleep(Person person){
        person.sleep();

    }
}
