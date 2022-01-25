package JavaStandard.ch10;

import java.util.Calendar;

public class Exercise10_5 {
	static int getDayDiff(String yyyymmdd1, String yyyymmdd2) {
		int diff = 0;
		try {
			int year1 = Integer.parseInt(yyyymmdd1.substring(0, 4));
			int month1 = Integer.parseInt(yyyymmdd1.substring(4, 6)) - 1;
			int day1 = Integer.parseInt(yyyymmdd1.substring(6, 8));

			int year2 = Integer.parseInt(yyyymmdd2.substring(0, 4));
			int month2 = Integer.parseInt(yyyymmdd2.substring(4, 6)) - 1;
			int day2 = Integer.parseInt(yyyymmdd2.substring(6, 8));

			// Calendar 객체 생성
			Calendar date1 = Calendar.getInstance();
			Calendar date2 = Calendar.getInstance();

			// 객체 생성 시 생기는 ms 차이 때문에 초기화
			date1.clear();
			date2.clear();

			// 초기화 된 객체에 날짜 설정
			date1.set(year1, month1, day1);
			date2.set(year2, month2, day2);

			diff = (int)((date1.getTimeInMillis() - date2.getTimeInMillis())) / (24 * 60 * 60 * 1000);
		} catch (Exception e) {
			diff = 0; // substring(), parseInt()에서 예외 발생 시 0 반환
		}
		return diff;
	}

	public static void main(String[] args) {
		System.out.println("20010103에서 20010101까지 " + getDayDiff("20010103", "20010101") + "일 차이 남"); // 2
		System.out.println("20010103에서 20010103까지 " + getDayDiff("20010103", "20010103") + "일 차이 남"); // 0
		System.out.println(getDayDiff("20010103", "200103"));   // 0
	}
}
