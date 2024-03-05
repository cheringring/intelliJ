package ch06;

public class Gugudan {
    public static void main(String[] args) {


        int sum =0;
        for (int i =1; i<=9; i++){
            for(int k=0; k<=9; k++){
                sum = i*k;
                System.out.println(+i+"x"+k+"="+sum);
            }
        }
// 5x5행렬

        int row =5;
        int col = 5;

        for (int i = 0; i<row; i++){
            for(int k=0; k<col; k++){
                System.out.print("* ");
            }
            System.out.println(); //ln은 자동 개행
        }

        System.out.println("-------------------");


        for (int i = 0 ; i<row; i++ ){
            for (int j =0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("==================" );

        for (int i =0; i<row; i++){
            for (int k=col+1; k> i+1; k--){
                System.out.print("   ");
            }
            for(int j=0; j<i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("=================");

        //        * * * * *
        //          * * *
        //            *
        for (int i =0; i<5; i+=2){
            for (int j=0; j<i; j+=2){
                System.out.print("a");
            }
            for(int k=5; k>i; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

