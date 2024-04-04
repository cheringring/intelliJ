package ch31;

public class InvalidOpreationException extends Exception{
    private int code;

    public InvalidOpreationException(String msg,int code) {
        super(msg);
        this.code=code;

    }

    public void precentCode(){
        System.out.println(code);
    }
}

class OrderProc{

    public void precessOrder(int num) throws InvalidOpreationException{
        if(num <= 0){
            var excption = new InvalidOpreationException("0보다 같거나 작은 주문 접수. 문제 발생",99);
            excption.precentCode();
            throw excption;
        }
        else System.out.println("항상 주문 접수");
    }
}

class Main___{
    public static void main(String[] args) {
        var orderProc = new OrderProc();

        try {
            orderProc.precessOrder(-5);
        }catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
