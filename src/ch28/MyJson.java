package ch28;


    public interface MyJson {
    String printJson();
    // 한달 뒤에 printJson에 대문자로 바뀌는 기능이 추가되어야한다고 가정.
        int age =9;

        // 일반 클래스의 인스턴스 메소드처럼
        // 인터페이스에서 사용할 수 있는 메소드.
        // 이건 범용 이어서
        default void UpperString() {
            // 얘는 구현체가 있다,
            String text = printJson().toUpperCase();
            System.out.println(text);
            // 구현체 o = 오버라이딩 o , implement하는 데에서도 호출가능.

        }

        default int jump(){
            go();
            return 1;
        }

       // 인터페이스 앞에  Public abstract 가 생략되어 있음.
        static void myInter(){
            go1();
            System.out.println(age+"my.......");
        }
        // static이 붙으면 바로 선언가능.

        private void go(){
            System.out.println("go");
        }
        private static void go1(){
            System.out.println("go1");
        }
        // private 는 지 클래스 안에서만 쓸 수 있음.
        // pubilc 은 안됨.

    }

    class Impl implements MyJson{
        @Override
        public String printJson() {
            return "kim";
        }


        @Override
        public void UpperString() {
            MyJson.super.UpperString();
        }

        @Override
        public int jump() {
            return MyJson.super.jump();
        }
    }

    class Imql2 implements MyJson{
        @Override
        public String printJson() {
            return "park";
        }

        @Override
        public void UpperString() {
            MyJson.super.UpperString();
        }

        @Override
        public int jump() {
            return MyJson.super.jump();
        }
    }

    class Ma {
        public static void main(String[] args) {
            new Impl().UpperString();
            // UpperString은 반환타입이 void.



            int jump = new Impl().jump();
            // 이건 반환타입이 int여서 int 라고 명시를 해줘야..출력되나?
            System.out.println(jump);

            // 왜 바로 New Impl().jump(); 했을 때 1이 출력이 안될까.?
            System.out.println("=================");
            new Impl().jump();
            System.out.println("=================");


            MyJson.myInter();

        }
    }

