package ch08.msg;

public class Customer {
    public String name;
    public String addr;


    // 외부에서 쓸 수 있도록 public으로 정의함.


    public void sendMsg(Phone phone,String msg) {
        phone.sendMsg(msg);

    }
}


