package ejercicios.ingles.exercice45;

public class Date implements Comparable<Date> {
	private int day;
	private int month;
	private int year;

	public Date() {

		this.day = 1;
		this.month = 1;
		this.year = 2000;
	}

	public Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	@Override
	public int compareTo(Date o) {
		// TODO Auto-generated method stub

		int result;

		if (this.year > o.getYear()) {
			result = 1;
		} else if (this.year < o.getYear()) {

			result = -1;
		} else if (this.month > o.getMonth()) {
			result = 1;
		} else if (this.month < o.getMonth()) {

			result = -1;
		} else if (this.day > o.getDay()) {
			result = 1;
		} else if (this.day > o.getDay()) {

			result = -1;
		} else {

			result = 0;
		}
		
		return result;

	}

}
