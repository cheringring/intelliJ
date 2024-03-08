package ch08.msg;

public class AppUI {
    public static void main(String[] args) {
        var customer = new Customer();
        var phone = new Phone();
        phone.number = "010-3333-7777";
        customer.setPhone(phone);
        customer.sendMsg("010-7777-9999",
                "안녕");

    }
}
