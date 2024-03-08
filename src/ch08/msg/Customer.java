package ch08.msg;

import javax.swing.*;

public class Customer {
    public String name;
    public String addr;
    public Phone phone;


    // 외부에서 쓸 수 있도록 public으로 정의함.


    public void setPhone(Phone phone){
        this.phone=phone;
    }
    public void sendMsg(String to, String content) {
        var message = new Message();
        message.makeMsg(content,phone.number,to);
        // makeMsg 를 message라는 객체에 탑재한다.
        phone.sendMsg(message);
    }
}
