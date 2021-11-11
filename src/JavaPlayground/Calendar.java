package JavaPlayground;

import java.util.Scanner;

public class Calendar {
    public static final int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public int getDays(int month) {
        return days[month-1];
    }

    public void printSampleCalendar() {
        System.out.println("일  월 화  수 목  금 토");
        System.out.println("--------------------");
        System.out.println(" 1  2  3  4  5  6  7");
        System.out.println(" 8  9 10 11 12 13 14");
        System.out.println("15 16 17 18 19 20 21");
        System.out.println("22 23 24 25 26 27 28");
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Calendar cal = new Calendar();

        System.out.println("달을 입력하세요.");
        int month = s.nextInt();

        System.out.println(month + "월은 " + cal.getDays(month) + "일까지 있습니다.");

        cal.printSampleCalendar();

        s.close();
    }
}
