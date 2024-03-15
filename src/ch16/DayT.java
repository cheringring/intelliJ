package ch16;
/*

* Class Week{
          Public static final week MONDAY = new Week (“MONDAY”);
        //  Public static final week TUESDAY = new Week (“TUSEDAY”);

          Public Week(String day){
                      This.day =day;
    }

Public getDay(){
             Return day;
          }
}

**/
enum Week { // enum은 Static 클래스기 때문에  (( . ))  으로 불러올 수 있다.
    // 상수의 집단
    MONDAY,
    TUSEDAY,

}

public class DayT {
    public static void main(String[] args) {
        Week today = null; // enum도 클래스기 때문에 객체다.
        today = Week.MONDAY;

        System.out.println(today);
        System.out.println(today==Week.MONDAY); // 조건을 상수화했기떄문에
        // true가 나올 수 있다.


        var days = Week.values(); // days에 Week가 가지고 있는 상수 벨류들을 다 리턴함.

        System.out.println(days); // [Lch16.Week;@7a81197d 이렇게 넣으면 이렇게 출력함.

        for (var w:days){
            System.out.println(w);
            }

        Week w= Week.TUSEDAY;
        System.out.println(w.name()); //TUSEDAY



        int weekNum = w.ordinal(); // 인덱스를 리턴해줌.
        System.out.println(weekNum);


        }
    }