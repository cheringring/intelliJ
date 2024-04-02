package ch30;

class Message<T>{
    // 이 메세지는 컨텐츠가 다양한 타입을 받겠구나.

    private T contents;

    public Message(T contents){
        this.contents = contents;
    }

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }
}



public class MessageSender {
    // 제너릭 메소드
    public <T> void sendMsg(Message<T> message,String to){
        T content = message.getContents();
        System.out.println("Sending msg to"+content);
    }
}

class UserT{


}
class GenericMsgSystem{
    public static void main(String[] args) {
        Message<String> stringMessage = new Message<>("Hello");
        MessageSender sender = new MessageSender();
        sender.sendMsg(stringMessage,"david");

        Message<UserT> userTMessage = new Message<>(new UserT());
       sender.sendMsg(userTMessage,"david");
    }
}
