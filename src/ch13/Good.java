package ch13;

public class Good {
    int sum;
    static int index;
    String str;

    {

        index=1;
        for (int i=0; i<50; i++){
            sum +=i;
        }
        System.out.println("인스턴스 블록");
    }

    // static 블럭 = 제일 먼저 올라간다.

static {
        String data = loadConfigData();
        index= 9;
        System.out.println("static block");
}


private static String loadConfigData(){
        System.out.println("load data.........");
        return "load data.........";
}


    public Good(){
        str = "hello";
        System.out.println("default constructor block");
    }
}

class Main3{
    public static void main(String[] args) {
        var good = new Good();
        var good1 = new Good();
        var good2 = new Good();
        System.out.println(good.sum);
    }
}
