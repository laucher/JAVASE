package com.imooc.test;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class Time {

	public static void main(String[] args) {
		Year year=Year.of(2012);
		
		YearMonth month1=year.atMonth(2);
		
		LocalDate localdate2=month1.atDay(29);
		
		System.out.println(localdate2);
		
		System.out.println(localdate2.isLeapYear());
		
		MonthDay localdate1=MonthDay.of(2, 29);
		
		localdate2=localdate1.atYear(2010);
		
		System.out.println(localdate2);
		
		System.out.println(localdate2.isLeapYear());
		
		DateTimeFormatter f=DateTimeFormatter.ofPattern("uuuuƒÍdd»’MM‘¬");
		
		String s=localdate2.format(f);
		
		System.out.println(s);
		
		
		
		
		
		
		
		

	}

}
