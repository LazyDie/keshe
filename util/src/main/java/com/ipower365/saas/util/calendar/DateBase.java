package com.ipower365.saas.util.calendar;

public class DateBase {
	public int iYear;
	public int iMonth;
	public int iDay;

	private static int checkYear(int iYear) {
		if ((iYear > 1901) && (iYear < 2050))
			return iYear;
		else {
			System.out
					.println(" The Year out of range, I think you want 1981 ");
			return 1981;
		}
	}

	public DateBase(int iYear, int iMonth, int iDay) {
		this.iYear = checkYear(iYear);
		this.iMonth = iMonth;
		this.iDay = iDay;
	}

	public DateBase(int iYear, int iMonth) {
		this.iYear = checkYear(iYear);
		this.iMonth = iMonth;
		this.iDay = 1;
	}

	public DateBase(int iYear) {
		this.iYear = checkYear(iYear);
		this.iMonth = 1;
		this.iDay = 1;
	}

	public DateBase() {
		this.iYear = 1981;
		this.iMonth = 1;
		this.iDay = 1;
	}

	public String toString() {
		return "" + this.iYear
				+ (this.iMonth > 9 ? "" + this.iMonth : " 0 " + this.iMonth)
				+ (this.iDay > 9 ? "" + this.iDay : " 0 " + this.iDay);
	}

	public boolean equals(DateBase md) {
		return ((md.iDay == this.iDay) && (md.iMonth == this.iMonth) && (md.iYear == this.iYear));
	}
}
