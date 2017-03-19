package main.questions;

public class Task3 {
	boolean isLeap = false;

	public int solution(int Y, String A, String B, String W) {
		// write your code in Java SE 8
		if (Y % 4 == 0) {
			isLeap = true;
		}
		// get the months in numbers 1 to 12
		int numberMonthA = getNumberOfMonth(A);
		int numberMonthB = getNumberOfMonth(B);

		// get the days from the start of year till beginning of the first month
		int daysFromBeginingA = 0;
		for (int i = 1; i < numberMonthA; i++) {
			daysFromBeginingA = daysFromBeginingA + getDaysInMonth(i);
		}
		// get the days from the start of year till the end of last month
		int daysFromBeginingB = daysFromBeginingA;
		for (int i = numberMonthA; i <= numberMonthB; i++) {
			daysFromBeginingB = daysFromBeginingB + getDaysInMonth(i);
		}

		// calculate first full week
		int beginDayOfWeek = getDayOfWeek(W);
		int firstMonday = (daysFromBeginingA - (7 - beginDayOfWeek)) / 7;
		if ((daysFromBeginingA - (7 - beginDayOfWeek)) % 7 != 0) {
			firstMonday = firstMonday + 1;
		}
		// last week
		int lastSunday = (daysFromBeginingB - (7 - beginDayOfWeek)) / 7;

		return lastSunday - firstMonday;
	}

	private int getDayOfWeek(String a) {
		DaysOfWeek d = DaysOfWeek.valueOf(a);
		switch (d) {
		case Monday:
			return 1;
		case Tuesday:
			return 2;
		case Wednesday:
			return 3;
		case Thursday:
			return 4;
		case Friday:
			return 5;
		case Saturday:
			return 6;
		case Sunday:
			return 7;
		default:
			return 0;
		}
	}

	private int getDaysInMonth(int d) {
		switch (d) {
		case 1:
			return 31;
		case 2:
			if (isLeap) {
				return 29;
			} else {
				return 28;
			}
		case 3:
			return 31;
		case 4:
			return 30;
		case 5:
			return 31;
		case 6:
			return 30;
		case 7:
			return 31;
		case 8:
			return 31;
		case 9:
			return 30;
		case 10:
			return 31;
		case 11:
			return 30;
		case 12:
			return 31;
		default:
			return 0;
		}
	}

	private int getNumberOfMonth(String a) {
		Months d = Months.valueOf(a);
		switch (d) {
		case January:
			return 1;
		case February:
			return 2;
		case March:
			return 3;
		case April:
			return 4;
		case May:
			return 5;
		case June:
			return 6;
		case July:
			return 7;
		case August:
			return 8;
		case September:
			return 9;
		case October:
			return 10;
		case November:
			return 11;
		case December:
			return 12;
		default:
			return 0;
		}
	}
}

enum Months {
	January, February, March, April, May, June, July, August, September, October, November, December
}

enum DaysOfWeek {
	Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}
