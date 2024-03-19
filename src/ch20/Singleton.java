package ch20;

import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
// Executor을 사용하면 편리하게 관리

public class Singleton {

    private static Singleton INSTANCE;

    private Singleton(){}

    // synchronized 다른 메모리들이 0,0001초라도 끼어들면 rock을 걺.
    public static synchronized Singleton getINSTANCE(){
        // 서로 다른 인스턴스가 확 몰린다. // cpu의 스케줄링 방법에 의해서 자의로 랜덤으로 뽑음
        if(INSTANCE ==null){
            INSTANCE = new Singleton();
        }
        return INSTANCE;
        // return 될때까지 책임짐.
    }
}

class Main_{
    public static void main(String[] args) {
       // Singleton singleton = Singleton.getINSTANCE();
        Singleton[] singletons = new Singleton[10];

        // thread Pool 생성
        ExecutorService service = Executors.newCachedThreadPool();
        // import java.util.concurrent.Executors; < 이거 씀.
        // 쓰레드 담을 수 있는 풀장을 만들어주는것. 익스큐터의.풀장을  익스큐터서비스로 받음.


        for (int i = 0; i<10; i++){
            // 러너블 = 추상화 인터페이스 객체 => Run을 구현  -> 이 객체가 pool에 들어감.
            final int num = i;
            // 한번할당하고 state문 돌때까지 변하지 않는다.
            service.submit(new Runnable() {
                // runnable의 run을 무조건 오버라이드(구현) 해야됨.
                @Override
                public void run() {
                    // 싱글톤 안에 num = 이 값이 변하지 않는다는 상수를 써야됨
                    // => final
                    singletons[num]= Singleton.getINSTANCE(); // < run 되었을 때 실질적으로 이게 실행되는거임.

                }
            });
// Thread start () -> 스레드가 runnable 상태가 됨.
 // Runnable state 에 하나 들어감.-> cpu가 하나 끄집어서 run상태에 스레드를 집어넣음.
 // -> 실행
        }

        service.shutdown();
        // 셧다운을 해야 메모리를 닫음. 헛 메모리를 안씀.


        for (var s: singletons){
            System.out.println(s);
        }
    }
}

