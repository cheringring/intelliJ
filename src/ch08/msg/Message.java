package ch08.msg;

public class Message {

   String content;
    String to;
    String from;

    public void makeMsg(String to, String from,String content){
        this.to=to;
        this.from =from;
        this.content=content;

    }
}
