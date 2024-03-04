package ch01;

public class NumberConvert {
    public static void main (String[] args){

        int i =10;
        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));

        System.out.println("-------------------");

        System.out.println(Integer.parseInt(Integer.toBinaryString(i), 2 ));
        // radix : 2진수로 표현해라.




    }
}
