package ch04;

import java.util.Calendar;
import java.util.Scanner;

public class CalendarTest {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("년도를 입력해주세요.");
        var year = sc.nextInt();


        var calendar = Calendar.getInstance();
        // calendar이라는 달력 인스턴스를 씀.
        calendar.set(Calendar.YEAR,year);
        calendar.set(Calendar.MONTH,1);

        var lastDay= calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println(lastDay);





        }
}
