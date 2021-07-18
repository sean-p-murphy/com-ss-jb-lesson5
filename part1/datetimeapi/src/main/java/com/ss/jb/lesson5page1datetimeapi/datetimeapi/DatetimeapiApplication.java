// 1. ZonedDateTime

// 2. TemporalAdjusters.previous(DayOfWeek.THURSDAY)

// 3. A ZoneId is an indicator of the time zone, such as Europe/Paris. A ZoneOffset is a number indicating the difference between the time requested and GMT or UTC time, such as UTC-8 or GMT+2.

// 4. instant.atZone(ZoneId.of(“Europe/Paris”)) and zonedDateTime.toInstant()

package com.ss.jb.lesson5page1datetimeapi.datetimeapi;
import java.time.LocalDate;
import java.time.Month;

public class DatetimeapiApplication {

	public static void daysInMonths(int year) {
		for (int i = 1; i < 13; i++) {
			LocalDate d = LocalDate.of(year, i, 1);
			System.out.println(d.getMonth() + " of " + d.getYear() + " is " + d.lengthOfMonth() + " days long.");
		}
	};

	public static void mondaysInMonth(Month month) {
		int nowYear = LocalDate.now().getYear();
		LocalDate testDate = LocalDate.of(nowYear, month, 1);
		for (int d = 1; d <= testDate.lengthOfMonth(); d++) {
			if (LocalDate.of(nowYear, month, d).getDayOfWeek().getValue() == 1) {
				System.out.println(LocalDate.of(nowYear, month, d).toString());
			}
		}
	};

	public static void friday13thTest(LocalDate date) {
		if (date.getDayOfMonth() == 13 && date.getDayOfWeek().getValue() == 5) {
			System.out.println(date + " is Friday the 13th.");
		} else {
			System.out.println(date + " is not Friday the 13th.");
		}
	}

	public static void main(String[] args) {

		int sampleYear = 2015;
		Month sampleMonth = Month.of(3);
		LocalDate sampleDate = LocalDate.of(2020, 11, 13);

		daysInMonths(sampleYear);
		mondaysInMonth(sampleMonth);
		friday13thTest(sampleDate);
	}

}
