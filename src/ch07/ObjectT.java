package ch07;

public class ObjectT {
    int instanceVar; //인스턴스변수 ,맴버변수
    // 여기선 var 타입을 못쓴다. 할당을 해야하는데 애매해지니까

    static int staticVar; // static변수 ,정적 변수
    // ObjectT <를 명기해줘야
    // 다른 클래스에서  얘를 찾을 수 있음.

    // int instanceVar; < =0;으로 초기화됨.



    public static void main(String[] args) {
        //main함수

        // 요렇게 명기한다.
        ObjectT.staticVar = 9;
        //  ObjectT.  을 넣으면 instanceVar이 보이지 않는다.


        var objectT = new ObjectT(); // 인스턴스 변수는 인스턴스가
        // 메모리에 올라 갈 때 new -> instanceVar 이 생성된다.
        objectT.instanceVar = 70;

        System.out.println(ObjectT.staticVar);
        System.out.println(objectT.instanceVar);

        // int localVar = 0; // 함수 블록 내에서 변수 할당. = 지역변수
        // 지역변수는 컴파일러가 초기화 해주지 않기때문에
        // 꼭 초기화 작업이 필요하다.
    }
}
