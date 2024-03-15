package ch17.mem;

public class Test {
    private int [] data ;
    static class InnerClass {

    }

    public Test (int size){
        data=new int[size];

    }
    public InnerClass getInnerClass(){
        return new InnerClass();
    }

}

class Main_{
    public static void main(String[] args) {
        Object [] objects = new Object[50];
        for (int count=0;  count < objects.length; count++){
            objects[count]= new Test(100000000).getInnerClass();
            //찍어내서 담음
            System.out.println(count);
            // 8번 돌고 사망함. = 힙 메모리 공간이 부족하다.

            // 이너 클래스에 static 붙이니까 49까지 구동함. !!

        }

    }

}
