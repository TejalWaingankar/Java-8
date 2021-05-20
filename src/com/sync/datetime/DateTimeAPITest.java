package com.sync.datetime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;

public class DateTimeAPITest {

	public static void main(String[] args) {
		localDateTest();
		localTimeTest();
		localDateTimeTest();
		localDateTimePeriodCheck();
	}

	private static void localDateTimePeriodCheck() {
		LocalDate birthDay = LocalDate.of(1987, 12, 12);
		LocalDate today = LocalDate.now();
		Period p = Period.between(birthDay, today);
		System.out.print("You are "+p.getYears());
		System.out.println(" years, "+p.getMonths()+" months and "+p.getDays()+" days old.");
	}

	private static void localDateTimeTest() {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Date Time : " + dateTime);

		int dayOfMonth = dateTime.getDayOfMonth();
		Month month = dateTime.getMonth();
		int year = dateTime.getYear();
		System.out.println("Day of month: " + dayOfMonth + " Month: " + month + " Year : " + year);

		int hour = dateTime.getHour();
		int minute = dateTime.getMinute();
		int second = dateTime.getSecond();
		int nano = dateTime.getNano();
		System.out.println("Hour: " + hour + " Minute : " + minute + " Second : " + second + " Nano : " + nano);
	}

	private static void localTimeTest() {
		LocalTime time = LocalTime.now();
		System.out.println("Time now : " + time);

		int hour = time.getHour();
		int minute = time.getMinute();
		int second = time.getSecond();
		int nano = time.getNano();
		System.out.println("Hour: " + hour + " Minute : " + minute + " Second : " + second + " Nano : " + nano);
	}

	private static void localDateTest() {
		LocalDate date = LocalDate.now();
		System.out.println("Todays Date : " + date);
		int dayOfMonth = date.getDayOfMonth();
		Month month = date.getMonth();
		int year = date.getYear();
		System.out.println("Day of month: " + dayOfMonth + " Month: " + month + " Year : " + year);

		DayOfWeek dayOfWeek = date.getDayOfWeek();
		int dayOfYear = date.getDayOfYear();
		boolean leapYear = date.isLeapYear();
		int lengthOfMonth = date.lengthOfMonth();
		int lengthOfYear = date.lengthOfYear();
		System.out.println("dayOfweek: " + dayOfWeek + " dayofYear : " + dayOfYear + " leapYear: " + leapYear
				+ " lengthOfMonth: " + lengthOfMonth + " leangthOfYear : " + lengthOfYear);
	}

}
