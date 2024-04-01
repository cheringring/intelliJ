package ch29;

interface Operate{
    int operate(int a,int b);
}
public class Calculator {

    private int a;
    private int b;

    public Calculator (int a,int b){
        this.a= a;
        this.b=b;
    }

    public int calculator(Operate op){
        return op.operate(a,b);
    }
}

class Main_ {
    public static void main(String[] args) {
        int num1= 10;
        int num2=20;

        Calculator calculator = new Calculator(num1,num2);
        int result = calculator.calculator(new Operate() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        });

        System.out.println(result);
    }
}
