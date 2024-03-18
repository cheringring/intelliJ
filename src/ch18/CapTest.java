package ch18;

public class CapTest {
    private String myHobby;

    //메소드 은닉

    private void init(){
        System.out.println("init");
    }

    public void process(){
        System.out.println("process");
    }
    public void release(){
        System.out.println("release");
    }

    public void work(){
        init();
        process();
        release();
    }
}
class Main_{
    public static void main(String[] args) {
        new CapTest().work();
    }
}

